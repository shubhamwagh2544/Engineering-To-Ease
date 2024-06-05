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

// Promise.race => Returns a promise that resolves or rejects as soon as one of the promises in the iterable resolves or rejects.

const promise = Promise.race([chain1(), chain2(), chain3()])
promise.then((data) => {
    console.log(data)                   // resolved 1
})
    .catch((err) => {
        console.log('err', err)
    })
    .finally(() => {
        console.log('finally')
    })