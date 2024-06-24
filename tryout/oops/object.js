const Course = function () {

};

Course.prototype.name = "javascript";

const student = new Course();

student.id = 1;

console.log(student);                           // Course { id: 1 }
console.log(student.constructor)                // [Function: Course]
console.log(student.id)                         // 1
console.log(student.name)                       // javascript

/*
    id: 1
    name: "javascript"
    constructor: ƒ ()
    [[Prototype]]: Object
*/