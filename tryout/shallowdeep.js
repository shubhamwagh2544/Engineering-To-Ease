/*
A shallow copy of an object is a copy of the object that only copies the properties at the first level. 
If the original object contains nested objects, the references to these nested objects are copied, not the nested objects themselves
This means that changes to the nested objects in the copied object will affect the nested objects in the original object and vice versa.

- Object.assign()
- ... (spread operator)
*/
//1
const originalObject = {
    a: 1,
    b: {
        c: 2
    }
}
const shallowCopy = Object.assign({}, originalObject)

shallowCopy.b.c = 3
console.log(originalObject.b.c)             // 3 (change in shallow copy changes deep copy)

//2
const shallowCopy1 = { ...originalObject }
shallowCopy.b.c = 4
console.log(originalObject.b.c)             // 4 (change in shallow copy changes deep copy)

// deep copy
/*
A deep copy of an object copies all levels of the object, including nested objects.
This means that the copied object and the original object are completely independent of each other.
Changes to the nested objects in the copied object will not affect the nested objects in the original object and vice versa.
- JSON methods (parse, stringify)
- lodash => cloneDeep() method
*/
console.log(originalObject)                 // { a: 1, b: { c: 4 } }
//1
const deepCopy = JSON.parse(JSON.stringify(originalObject))
deepCopy.b.c = 5
console.log(deepCopy)                       // { a: 1, b: { c: 5 } }
console.log(originalObject.b.c)             // 4

//2: lodash
const lodash = require('lodash')
const deepCopy1 = lodash.cloneDeep(originalObject)
deepCopy1.b.c = 5
console.log(deepCopy1)                       // { a: 1, b: { c: 5 } }
console.log(originalObject.b.c)              // 4