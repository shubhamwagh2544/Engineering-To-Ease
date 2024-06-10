function Person(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
}

const member = new Person('Lydia', 'Hallie');
Person.getFullName = function () {
    return `${this.firstName} ${this.lastName}`;
};

console.log(member.getFullName());              // TypeError: member.getFullName is not a function

// solution
// 1
console.log(Person.getFullName())               // undefined undefined
// 2
Person.prototype.getFull = function () {
    return `${this.firstName} ${this.lastName}`;
};
console.log(member.getFull())                   // Lydia Hallie
//3
member.__proto__.getFullN = function () {
    return `${this.firstName} ${this.lastName}`;
}
console.log(member.getFull())                   // Lydia Hallie

/*
In JavaScript, functions are objects, and therefore, the method getFullName gets added to the constructor function object itself. For that reason, we can call Person.getFullName(), but member.getFullName throws a TypeError.

If you want a method to be available to all object instances, you have to add it to the prototype property
*/

console.log(Person)         // [Function: Person] { getFullName: [Function (anonymous)] }
console.log(member)         // Person { firstName: 'Lydia', lastName: 'Hallie' }