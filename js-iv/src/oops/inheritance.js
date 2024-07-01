function Person(name, age) {
    this.name = name
    this.age = age
}

Person.prototype.greet = function () {
    console.log(`Hello, my name is ${this.name}`);
}

function Student(name, age, grade) {
    Person.call(this, name, age)                // Call the parent constructor
    this.grade = grade
}

console.log(Person.prototype)                   // { greet: [Function (anonymous)] }
console.log(Student.prototype)                  // {}

Student.prototype = Object.create(Person.prototype)

console.log(Person.prototype)                   // { greet: [Function (anonymous)] }
console.log(Student.prototype)                  // Person {}
console.log(Student.prototype.constructor)      // [Function: Person]

Student.prototype.constructor = Student
console.log(Student.prototype.constructor)      // [Function: Student]

Student.prototype.study = function () {
    console.log(`${this.name} is studying`);
};

const student = new Student('Alice', 20, 'A');
student.greet()                                 // Hello, my name is Alice
student.study()                                 // Alice is studying