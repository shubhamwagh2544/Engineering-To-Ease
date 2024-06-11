const promise1 = new Promise((res, rej) => {
    setTimeout(() => {
        res('one')
    }, 500)
})
const promise2 = new Promise((res, rej) => {
    setTimeout(() => {
        res('two')
    }, 200)
})
const promise3 = new Promise((res, rej) => {
    setTimeout(() => {
        rej('error')
    }, 500)
})
const promise4 = new Promise((res, rej) => {
    setTimeout(() => {
        res('four')
    }, 400)
})

/*
Promise.allSettled: takes an iterable of promises and returns a single promise that resolves when all of the input promises have settled (either resolved or rejected). 
The returned promise always resolves with an array of objects describing the outcome of each promise.
*/

Promise.allSettled([promise1, promise2, promise3, promise4])
    .then(res => {
        res.forEach((data) => {
            if (data.status === 'fulfilled') {
                console.log(data.value, data.status)            // value for fulfilled
            }
            else if (data.status === 'rejected') {
                console.log(data.reason, data.status)           // reason for rejected
            }
        })
    })
    .catch((err) => {
        console.log(err)
    })

/*
one fulfilled
two fulfilled
four fulfilled
*/