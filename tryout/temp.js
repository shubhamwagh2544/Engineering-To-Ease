const obj = {}

Object.assign(obj, { age: 24 })
Object.assign(obj, { name: 'shubham' })

console.log(obj)

// Object.assign is used to copy the values of all enumerable own properties from one or more source objects to a target object.
// Shallow Copy: Only copies properties and values. Nested objects are copied by reference.

const obj1 = {
    nam1: 'sh'
}
const obj2 = {
    nam2: 'sw'
}

// Object.assign(obj, [obj1, obj2])
Object.assign(obj, ...[obj1, obj2])

console.log(obj)