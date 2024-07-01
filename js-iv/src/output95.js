class Person {
    constructor(name) {
        this.name = name;
    }
}

const member = new Person('John');
console.log(typeof member);             // object

/*
Classes are syntactical sugar for function constructors. The equivalent of the Person class as a function constructor would be:

function Person(name) {
  this.name = name;
}

Calling a function constructor with new results in the creation of an instance of Person, typeof keyword returns "object" for an instance. typeof member returns "object".
*/