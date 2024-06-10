/*
All object have prototypes.
A: true
B: false

=> True
*/

//1
/*
Objects Created with Constructors (Including new Object()):
    When you create an object using a constructor function (e.g., new Person()), the newly created object has a prototype. This prototype is an object that the constructor function's prototype property points to.
*/
function Person() { }
const person = new Person();
console.log(Object.getPrototypeOf(person) === Person.prototype); // true
console.log(Person.prototype === person.__proto__)              // true

//2
/*
Objects Created with Object Literals:
    Even objects created with object literals {} have prototypes. Specifically, their prototype is Object.prototype.
*/
const obj = {};
console.log(Object.getPrototypeOf(obj) === Object.prototype);   // true
console.log(Object.prototype === obj.__proto__);                // true

//3
/*
Objects Created with Object.create():
    When using Object.create(prototypeObject), the newly created object has the specified prototype object.
*/
const prototypeObject = { greet: function () { console.log('hello'); } };
const obj1 = Object.create(prototypeObject);
console.log(Object.getPrototypeOf(obj1) === prototypeObject); // true

//4
/*
Edge Case - Object.create(null):
    The exception is when you create an object with Object.create(null). This creates an object that has no prototype.
    This object is often called a "dictionary" or a "map" because it is purely a collection of key-value pairs without the usual inheritance from Object.prototype.
*/
const obj2 = Object.create(null);
console.log(Object.getPrototypeOf(obj2));       // null


/*
All objects in JavaScript have prototypes, except for objects explicitly created with Object.create(null), which have no prototype. Typically, when you create an object using an object literal ({}) or the new keyword, the object has a prototype. For example, an object created with {} has Object.prototype as its prototype.

These objects have access to methods and properties such as .toString() because these methods are defined on the prototype. Even if the method is not found directly on the object, JavaScript searches down the prototype chain until it finds the method, making it accessible to you. This prototype chain mechanism allows JavaScript to provide built-in methods and properties to all objects.
*/

console.log(obj.toString())         // [object Object]
console.log(obj1.toString())        // [object Object]
console.log(obj2.toString())        // TypeError: ob.toString is not a function