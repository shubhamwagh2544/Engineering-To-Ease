// resolves promise when button is clicked

const promise = new Promise((res, rej) => {
    document.getElementById('btn-res').addEventListener('click', () => {
        res('resolved')
    })
    document.getElementById('btn-rej').addEventListener('click', () => {
        rej('rejected')
    })
})
console.log(promise)

promise
    .then((val) => console.log(val))
    .catch((val) => console.log(val))

//promise
//    .catch((val) => console.log(val))


// create promise without promise syntax :=> async
async function myFunction() {
    // resolve promise
    const res = await promise;
    console.log(res)
    return "new resolved"

    // rejected
    //throw new Error

    // resolved
    //return 'hello world'
}
const newPromise = myFunction()
const newRes = await newPromise
console.log(newRes)