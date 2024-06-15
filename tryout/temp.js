// (function (a) {
//     return (function (b) {
//         console.log(a)
//     })(6)
// })(5)               // 5


// const promise = new Promise((res, rej) => {
//     res('yes')
// })

// // const promise = Promise.resolve('yes)        // Error: Promise.resolve() is not a function

// async function call() {
//     try {
//         console.log(await promise)
//     }
//     catch (err) {
//         console.log('oops error')
//     }
//     finally {
//         console.log('always')
//     }
// }

// call()                  // yes always

// const add = x => x + x

// function call(num = 2, value = add(num)) {
//     console.log(num, value)
// }

// call()                  // 2 4
// call(3)                 // 3 6

// const arr = [1, 3]

// const newarr = [3, 4, ...arr]
// console.log(newarr)

// const newarr2 = [5, 6, ...newarr, ...[7, 8]]
// console.log(newarr2)        // [5, 6, 3, 4, 1, 3, 7, 8]

// const obj = {
//     "1": "a",
//     1: "b",
//     [1]: "c"
// }

// console.log(obj["1"])

/*
In JavaScript, object keys are always converted to strings unless they are symbols. When you define an object key using a number or a string, it gets converted to a string.
"1": "a" => The key is the string "1".

1: "b" => The key is the number 1, but it gets converted to the string "1".

[1]: "c" => The key is computed as the number 1, which also gets converted to the string "1".

Therefore, all three keys ("1", 1, and [1]) are considered the same key, "1".
Hence object becomes: obj = { "1": "c" }
*/

// const obj = {
//     name: 'sh',
//     age: 25
// }
// console.log(obj.name)       // sh
// console.log(obj.age)       // 25
// delete obj.name
// delete obj['age']
// console.log(obj.name)       // undefined
// console.log(obj.age)       // undefined

// console.log(Number(""))         // 0
// console.log(parseInt(""))       // NaN

// console.log(Number("7*3"))      // NaN
// console.log(parseInt("7*3"))    // 7


// const arr = new Array(4)
// console.log(arr.length)             // 4
// arr.forEach((val) => console.log(val))        // doesnt run since no indexes

// const newarr = [...new Array(4)]
// newarr.forEach(val => console.log(val))      // works => undefined

// const arr2 = new Array(4).fill(0)
// arr2.forEach(val => console.log(val))        // works => 0


// const obj1 = {
//     a: 1,
//     b: 2
// }

// const obj2 = {
//     b: 3,
//     c: 4
// }

// const mergedObj = { ...obj1, ...obj2 }

// console.log(mergedObj)                      // { a: 1, b: 3, c: 4 }