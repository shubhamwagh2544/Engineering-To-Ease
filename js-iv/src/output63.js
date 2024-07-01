// whether given code is synchronous or asynchronous ?

new Promise(() => console.log('hello'))     // synchronous

/*
When you create a new Promise, the function passed to the Promise constructor (known as the executor function) is executed immediately and synchronously. However, any actions you take within the Promise that involve resolving or rejecting the promise are asynchronous.

In this case, the console.log('hello') inside the executor function is executed immediately and synchronously. There is no asynchronous behavior involved in just creating the promise and executing the provided function.
*/

new Promise((resolve, reject) => {
    console.log('hello');           // Synchronous
    resolve();                      // Asynchronous
}).then(() => {
    console.log('world');           // Asynchronous
});

console.log('!');                   // Synchronous

// hello => ! => world

/*
console.log('hello') is executed synchronously when the promise is created.

console.log('!') is also executed synchronously immediately after the promise is created.

The resolve() call schedules the execution of console.log('world') to happen asynchronously in the next event loop cycle, hence it logs after !.
*/