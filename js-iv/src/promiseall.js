function chain1() {
    return new Promise((res, rej) => {
        setTimeout(() => {
            const data = 'resolved 1'
            res(data)
        }, 1000)
    })
}
function chain2() {
    return new Promise((res, rej) => {
        setTimeout(() => {
            const data = 'resolved 2'
            res(data)
        }, 1000)
    })
}
function chain3() {
    return new Promise((res, rej) => {
        setTimeout(() => {
            const data = 'resolved 3'
            res(data)
        }, 1000)
    })
}

// Promise.all => Returns a single promise that resolves when all of the promises in the iterable have resolved or rejects if any of the promises reject.

const promise = Promise.all([chain1(), chain2(), chain3()])

promise
    .then((data) => {                   // array of results from all promises
        console.log(data)
        data.forEach((val) => {
            console.log(val)
        })
    })
    .catch((err) => {               //  It rejects if any of the promises reject.
        console.log('err', err)
    })
    .finally(() => {                // executes no matter what (success/failure)
        console.log('finally')
    })


// when we have 2 promises, one resolved and one rejected, then promise.all execute catch handler since onr promise got rejected
// only when all promises are resolved, it executes then handler to validate data

const promise4 = new Promise((res, rej) => {
    setTimeout(() => {
        const data = 'promise success'
        res(data)
    }, 1000)
})
const promise5 = new Promise((res, rej) => {
    setTimeout(() => {
        const data = 'error inside promise'
        rej(data)
    }, 1000)
})

const promiseall = Promise.all([promise4, promise5])

promiseall
    .then((res) => {
        res.forEach(data => {
            console.log(data)
        })
    })
    .catch(err => {
        console.log(err)            // error inside promise
    })