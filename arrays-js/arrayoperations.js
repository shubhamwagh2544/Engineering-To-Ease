const arr = [1, 2, 3, 4, "shubham", "wagh", false, { msg: 'successs' }]

// iterable
for (const item of arr) {
    console.log(item)
}

for (let i = 0; i < arr.length; i++) {
    console.log(arr[i])
}

for (let key in arr) {
    console.log(key, " : ", arr[key])
}

// add element at end
arr.push(10);

// add element in front
arr.unshift("first");

console.log(arr)

// remove element from end
console.log(arr.pop())

// remove element from front
console.log(arr.shift())

console.log(arr)

// map
const newArr = arr.map((el) => {
    if (typeof el === 'string') {
        return el = el.toUpperCase()
    }
    else if (typeof el === 'boolean') {
        return el = !el
    }
    else if (typeof el === 'number') {
        return el = el + 1
    }
    else {
        return el
    }
})
console.log(newArr)

// filter
const filteredNumberArray = arr.filter((el) => {
    if (typeof el === 'number') {
        return el
    }
})
console.log(filteredNumberArray)

const filteredStringArray = arr.filter((el) => {
    if (typeof el === 'string') {
        return el
    }
})

// reduce
const res1 = filteredNumberArray.reduce((accumulator, currentValue) => {
    return accumulator + currentValue
}, 0)
console.log(res1)

const res2 = filteredStringArray.reduce((accumulator, currentValue) => {
    return accumulator + currentValue
}, "")
console.log(res2)

// finding total cost of items in shopping cart
const shoppingCart = [
    { name: "Shirt", price: 25 },
    { name: "Pants", price: 40 },
    { name: "Shoes", price: 60 },
    { name: "Hat", price: 15 }
]
const totalPrice = shoppingCart.reduce((accumulator, currentElement) => {
    return accumulator + currentElement.price
}, 0)
console.log(totalPrice)

// product of positive numbers in array
const numbers = [2, -3, 5, 7, -1, 4];
const productResult = numbers.reduce((accumulator, currentValue) => {
    if (currentValue > 0) {
        return accumulator * currentValue
    }
    else {
        return accumulator
    }
}, 1)
console.log(productResult)

/*
the accumulator is a value that accumulates the results of the callback function on each element of the array.
It holds the intermediate result of the computation performed in each iteration of the reduce() method.
*/

// concat
let greetings = "Hello"
let user = "world"
const greetingsUser = greetings.concat(" ", user, "!")
console.log(greetingsUser)

let arr1 = [1, 2]
let arr2 = [3, 4]
const arr3 = arr1.concat(arr2)
console.log(arr3)

console.log("hello".concat(" ", "world", "!"))

const res3 = filteredStringArray.reduce((accumulator, currentElement) => {
    return accumulator.concat(" ", currentElement)
}, "Name:")
console.log(res3)

// slice: returns a shallow copy of a portion of an array into a new array object 
const slicedArray1 = arr.slice(1, 5)     // sliced array from index 1 to 5
console.log(slicedArray1)

const slicedArray2 = arr.slice(2)
console.log(slicedArray2)

// splice: 