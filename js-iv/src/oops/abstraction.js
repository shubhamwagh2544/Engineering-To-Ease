function count(name, age) {
    this.name = name
    this.age = age

    return {
        getName: function () {
            // return this.name             ❌
            return name
        },
        getAge: function () {
            // return this.age              ❌
            return age
        }
    }
}

const counter = new count('jack', 100)
console.log(counter.getName())              // jack
console.log(counter.getAge())               // 100

const newcounter = new count()
console.log(newcounter.getName())          // jack
console.log(newcounter.getAge())           // 100

/*
The methods getName and getAge are using this to access the properties, but this inside these methods will not refer to the count instance. Instead, they will refer to the object returned by the count constructor function, where name and age properties do not exist.
*/

function count1(name, age) {
    this.name = name
    this.age = age
}
const counter1 = new count1('jack', 10)
console.log(counter1)           // count1 { name: 'jack', age: 10 }

// what if I return another object from constructor function ?
function count2(name, age) {
    this.name = name
    this.age = age
    return {
        id: 1,
        name: 'shubham'
    }
}
const counter2 = new count2('jack', 10)
console.log(counter2)           // { id: 1, name: 'shubham' }