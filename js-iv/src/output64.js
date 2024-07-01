// whether given code is synchronous or asynchronous ?

(async () => console.log(6))();     // synchronous

/*
Although the function is declared as async, the console.log(6) statement inside it is synchronous. As a result, console.log(6) is executed immediately when the function is invoked.

The async function returns a promise, but since there are no asynchronous operations (like await or Promise handling) inside the function, the promise is resolved immediately.
*/

console.log('start');

(async () => console.log(6))();

console.log('end');

// start => 6 => end