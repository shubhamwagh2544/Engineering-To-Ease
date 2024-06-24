// 1: Closures
function Person1(name, age) {
    let _name = name || 'shubham'               // else error: 'name' has already been declared
    let _age = age || 25

    return {
        getName: function () {
            return _name
        },
        getAge: function () {
            return _age
        }
    }
}
const person1 = new Person1('jack', 100)
console.log(person1.getName())          // jack
console.log(person1.getAge())           // 100
const person11 = new Person1()
console.log(person11.getName())         // shubham
console.log(person11.getAge())          // 25

// 2: Classes
class Person2 {
    constructor(name, age) {
        this._name = name || 'shubham'
        this._age = age || 25
    }
    getName() {
        return this._name
    }
    getAge() {
        return this._age
    }
}
const person2 = new Person2('jack', 100)
console.log(person2.getAge())           // 100
console.log(person2.getName())          // jack
const person22 = new Person2()
console.log(person22.getAge())          // 25
console.log(person22.getName())         // shubham


// 3: Classes with private variables
class Person3 {
    #name
    #age
    constructor(name, age) {
        this.#name = name || 'shubham',
            this.#age = age || 25
    }
    getName() {
        return this.#name
    }
    getAge() {
        return this.#age
    }
}
const person3 = new Person3('jack', 100)
console.log(person3.getAge())           // 100
console.log(person3.getName())          // jack
const person33 = new Person3()
console.log(person33.getAge())          // 25
console.log(person33.getName())         // shubham