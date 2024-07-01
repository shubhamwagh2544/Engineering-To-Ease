//1
const add = (a) => (b) => a + b
console.log(add(2)(3))

//2
const multiply = (a) => (b) => (c) => a * b * c
const mul1 = multiply(2)
const mul2 = mul1(3)
const mul3 = mul2(4)
console.log(mul3)

//3
function call1(a) {
    return function call2(b) {
        return function call3(c) {
            return a * b * c
        }
    }
}
console.log(call1(2)(3)(4))

//currying: transforming function with multiple arguments into sequence of functions with single argument
//how to achieve => return function from function
// add(a, b) => a+b ==>> (a) => (b) => a+b

const obj = {
    name: 'shubham',
    age: 14
}