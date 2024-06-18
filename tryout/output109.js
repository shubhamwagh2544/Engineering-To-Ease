// What's its value?

Promise.resolve(5);

/*
We can pass any type of value we want to Promise.resolve, either a promise or a non-promise. The method itself returns a promise with the resolved value (<fulfilled>). If you pass a regular function, it'll be a resolved promise with a regular value. If you pass a promise, it'll be a resolved promise with the resolved value of that passed promise.

In this case, we just passed the numerical value 5. It returns a resolved promise with the value 5.
*/

const data = Promise.resolve('data')        // Promise {<fulfilled>: 5}
console.log(data)

const data3 = Promise.reject('data')
console.log(data3)              // UnhandledPromiseRejection Error: Promise { <rejected> 'data' }

const data5 = new Promise()
console.log(data5)              // TypeError: Promise resolver undefined is not a function

const data7 = new Promise(() => console.log('data'))
console.log(data5)                          // Promise { <pending> }