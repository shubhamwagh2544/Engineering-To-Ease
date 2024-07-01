// 1: in obj literals
const obj = {
    name: 'shubham',
    age: 25,
    get getDetails() {
        return this.name + " " + this.age
    },
    set setDetails(details) {                 // A 'set' accessor must have exactly one parameter.
        this.name = details.name
        this.age = details.age
        return this.name + " " + this.age
    }
}

console.log(obj)
console.log(obj.getDetails)
console.log(obj.setDetails)

obj.setDetails = { name: 'newname', age: 100 }
console.log(obj)

// 2: in classes
class MyClass {
    constructor(name) {
        this.name = name
    }
    get getName() {
        return this.name
    }
    set setName(name) {
        this.name = name
    }
}
const myclass = new MyClass('shubham')
console.log(myclass)
console.log(myclass.getName)

myclass.setName = 'wagh'
console.log(myclass.name)

// 3: object defineproperty
const object = {
    name: 'shubham'
}
Object.defineProperty(object, 'newKey', {
    get() {
        return this.name
    },
    set(name) {
        this.name = name
    }
})
console.log(object)
console.log(object.newKey)
object.newKey = 'wagh'
console.log(object)

console.log(Object.keys(object))            // [ 'name' ]