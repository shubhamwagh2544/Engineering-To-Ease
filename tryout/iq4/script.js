// resolves promise when button is clicked

const promise = new Promise((res, rej) => {
    document.getElementById('btn').addEventListener('click', () => {
        res('resolved')
    })
})
console.log(promise)

promise.then((val) => console.log(val))
console.log(promise)