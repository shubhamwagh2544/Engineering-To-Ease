const myPromise = () => Promise.resolve('I have resolved!');
// const myPromise = () => new Promise((res, rej) => res('I have resolved!'))
// const myPromise = () => new Promise((res, rej) => setTimeout(() => res('I have resolved!'), 500))

function firstFunction() {
    myPromise().then(res => console.log(res));
    console.log('second');
}

async function secondFunction() {
    console.log(await myPromise());
    console.log('second');
}

firstFunction();
secondFunction();

/*
With a promise, we basically say I want to execute this function, but I'll put it aside for now while it's running since this might take a while. Only when a certain value is resolved (or rejected), and when the call stack is empty, I want to use this value.

We can get this value with both .then and the await keywords in an async function. Although we can get a promise's value with both .then and await, they work a bit differently.

In the firstFunction, we (sort of) put the myPromise function aside while it was running, but continued running the other code, which is console.log('second') in this case. Then, the function resolved with the string I have resolved, which then got logged after it saw that the callstack was empty.

With the await keyword in secondFunction, we literally pause the execution of an async function until the value has been resolved before moving to the next line.

This means that it waited for the myPromise to resolve with the value I have resolved, and only once that happened, we moved to the next line: second got logged.
*/

/*
In firstFunction: The promise is initiated and .then schedules the logging of its result. Meanwhile, the synchronous code console.log('second') executes immediately. When the promise resolves, the .then callback logs I have resolved! after the call stack is empty.

In secondFunction: The execution pauses at await myPromise() until the promise resolves. Once it resolves, I have resolved! is logged, followed by console.log('second').
*/