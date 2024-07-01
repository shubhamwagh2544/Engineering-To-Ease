(() => {
    let x = (y = 10);
    console.log('x inside IIFE: ', typeof x)
})();

console.log(typeof x);              // undefined
console.log(typeof y);              // number

/*
let x = (y = 10); is actually shorthand for:
y = 10;
let x = y;

When we set y equal to 10 (y=10), we actually add a property y to the global object (window in the browser, global in Node). In a browser, window.y is now equal to 10.

Then, we declare a variable x with the value of y, which is 10. Variables declared with the let keyword are block scoped, they are only defined within the block they're declared in; the immediately invoked function expression (IIFE) in this case. When we use the typeof operator, the operand x is not defined: we are trying to access x outside of the block it's declared in. This means that x is not defined. Values who haven't been assigned a value or declared are of type "undefined". console.log(typeof x) returns "undefined".

However, we created a global variable y when setting y equal to 10. This value is accessible anywhere in our code. y is defined, and holds a value of type "number". console.log(typeof y) returns "number".
*/