// (function () {
//     console.log('hey there')
// })()

// (function (name) {
//     console.log(`${name} is my name`)
// })('shubham')

// (function callme(no) {
//     console.log('number: ', no)
// })(7)

// (() => console.log('hushoo'))()

/*
Encapsulation: Variables and functions inside the self-invoking function are not accessible from the outside, reducing the risk of conflicts.
*/

let counter = (function () {
    let count = 0
    return {
        increment: function () {
            return count++
        },
        decrement: function () {
            return count--
        },
        value: function () {
            return count
        }
    }
})()

console.log(counter.increment())
console.log(counter.decrement())
console.log(counter.value())