const arr = new Array(4)

console.log(arr.length)             // 4
arr.forEach((val) => console.log(val))        // doesnt run since no indexes

// solution
// 1
const newarr = [...new Array(4)]
newarr.forEach(val => console.log(val))      // works => undefined

// 2
const arr2 = new Array(4).fill(0)
arr2.forEach(val => console.log(val))        // works => 0