// const x = [1, 3, 4]
// const x = {a:'sh'}
// const x = 101
const x = NaN

if (x >= 100) {
    console.log('x >= 100 works')
}

if (!(x < 100)) {
    console.log('!(x < 100) works')
}

// works for type number
// does not work for NaN

console.log(isNaN('shubham'))
console.log(isNaN(121))
console.log(isNaN([1, 2, 3]))
console.log(isNaN({ a: 'sh' }))