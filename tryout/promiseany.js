const promise3 = Promise.reject('err')
const promise1 = Promise.resolve('ok')
const promise2 = Promise.reject('err')

Promise.any([promise1, promise2, promise3]).then(res => console.log(res))

/*
Promise.any returns the first fulfilled promise.
Or returns a rejected value when all of the promises in the array return rejects or if the array is empty
*/