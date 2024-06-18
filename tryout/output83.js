const { firstName: myName } = { firstName: 'Lydia' };

console.log(myName);                // Lydia
// console.log(firstName);             // ReferenceError

/*
By using destructuring assignment syntax we can unpack values from arrays, or properties from objects, into distinct variables:
const { firstName } = { firstName: 'Lydia' };

Also, a property can be unpacked from an object and assigned to a variable with a different name than the object property:
const { firstName: myName } = { firstName: 'Lydia' };

Therefore, firstName does not exist as a variable, thus attempting to access its value will raise a ReferenceError.
*/

/*
Whenever Javascript is unable to find a variable within the current scope, it climbs up the Scope chain and searches for it and if it reaches the top-level scope, aka Global scope, and still doesn't find it, it will throw a ReferenceError.

In Browsers such as Chrome, name is a deprecated global scope property. In this example, the code is running inside global scope and there is no user-defined local variable for name, therefore it searches the predefined variables/properties in the global scope which is in the case of browsers, it searches through window object and it will extract the window.name value which is equal to an empty string.

name in browser: ""
name in nodejs: ReferenceError: name not defined

In NodeJS, there is no such property on the global object, thus attempting to access a non-existent variable will raise a ReferenceError.
*/

const { var1, var2: myVar } = { var1: 10, var2: 20 }
console.log(var1)       // 10
console.log(myVar)      // 20

// same behaviour not supported in array destructuring
const [var3, var4] = [1, 2]
console.log(var3)       // 1
console.log(var4)       // 2