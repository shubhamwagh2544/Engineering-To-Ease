let greeting;
greetign = {};              // Typo!

console.log(greetign);      // {}

/*
It logs the object, because we just created an empty object on the global object! When we mistyped greeting as greetign, the JS interpreter actually saw this as:

global.greetign = {} in Node.js
window.greetign = {} in browser
globalThis.greetign in all environments.

In order to avoid this, we can use "use strict". This makes sure that you have declared a variable before setting it equal to anything.
*/