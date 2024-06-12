/*
One of the drawbacks of declaring methods directly in JavaScript objects is that they are very memory inefficient. 
When you do that, a new copy of the method is created for each instance of an object.
*/

// TypeScript doesn't natively support function constructors with `this` typing easily, 
// a better approach would be to use a class for clarity and type safety.

// 1

const Employee = function (name, age) {
    this.name = name || 'default'
    this.age = age || 100

    this.formatEmployee = function () {
        return `employee ${name} has ${age} age`
    }
}

let employee1 = new Employee('shubham', 15)
console.log(employee1.formatEmployee())

// 2 : prototype
Employee.prototype.formatEmployee2 = function () {
    return `new format: employee ${this.name} has ${this.age} age`
}

employee1.formatEmployee2()         // works

// 3 : class
class NewEmployee {
    constructor(name, age) {
        this.name = name
        this.age = age
    }

    formatEmployee() {
        return `employee ${name} has ${age} age`
    }
}

const newemployee = new NewEmployee()
console.log(newemployee.formatEmployee())

NewEmployee.prototype.formatEmployee2 = function () {
    return `new format: employee ${this.name} has ${this.age} age`
}

newemployee.formatEmployee2()       // works

// 4 : Object.create()
const employeePrototype = {
    formatEmployee2: function () {
        return `new format: employee ${this.name} has ${this.age} age`
    }
}

const employee2 = Object.create(employeePrototype)
employee2.name = 'John'
employee2.age = 30

console.log(employee2.formatEmployee2()) // works

/*
Each object in JavaScript has a prototype, and this forms a chain of prototypes, known as the prototype chain.
Object.prototype object serves as the ultimate prototype in JavaScript.
Ways to create prototype for objects explicitly
    - constructors in classes in ES6
    - using prototype property on every object
    - Object literals can be directly assigned a prototype using Object.create()
*/