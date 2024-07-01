function call(a, b, c) {
    console.log('shubham')
}

console.log(call.name)              // call
console.log(call.length)            // 3 (number of parameters)

call.age = 25
console.log(call)                   // [Function: call] { age: 25 }
console.log(call.age)

const temp = () => {
    console.log('func inside func')
}
call.anotherFunc = temp

call.anotherFunc()                  // func inside func
console.log(call)                   // [Function: call] { age: 25, anotherFunc: [Function: temp] }


/*
in JavaScript, functions are indeed objects. This means that they have properties and methods just like any other object. This feature allows functions to have additional capabilities and behavior beyond just being callable pieces of code.

- Functions have built-in properties like name, length, and prototype
- Functions come with built-in methods like call, apply, and bind.
- Functions can be stored in variables, object properties, and arrays.
- Functions as High Order Functions and Functions as First Class Citizens
*/

console.log(typeof call)            // function (even if all js functions are objects)