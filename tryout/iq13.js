// what is output ?

const promise = Promise.reject('err')       // Error

/*
[UnhandledPromiseRejection: This error originated either by throwing inside of an async function without a catch block, or by rejecting a promise which was not handled with .catch(). The promise rejected with the reason "err".
*/


// solve
// promise.catch(err => console.log(err))