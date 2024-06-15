const promise = Promise.resolve('yes')      // yes

// const promise = Promise.resolve()           // undefined

// const promise = new Promise((res, rej) => {
//     res('yes')
// })

async function call() {
    try {
        console.log(await promise)
    }
    catch (err) {
        console.log('oops error')
    }
    finally {
        console.log('always')
    }
}

call()                                      // yes always