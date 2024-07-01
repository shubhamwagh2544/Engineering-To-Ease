// 1
function rest(...arg) {
    console.log(arg)                         // [ 1, 2, 3, 4, 5 ]
}
rest(1, 2, 3, 4, 5)

// 2
function rest1(x, y, ...arg) {
    console.log(x)                          // 10
    console.log(y)                          // 20
    console.log(arg)                        // [ 30, 40, 50 ]
}
rest1(10, 20, 30, 40, 50)

// 3
function sum(...numbers) {
    console.log(numbers.reduce((acc, curr) => acc + curr))
}
sum(1, 2, 3, 4, 5)                          // 15

// 4
function multiply(mulitplier, ...numbers) {
    const newarr = numbers.map(num => num * mulitplier)
    console.log(newarr)
}
multiply(2, 3, 4, 5)                        // [ 6, 8, 10 ]

// 5
function logArgs(...args) {
    console.log(args);
}

logArgs();                                // []  