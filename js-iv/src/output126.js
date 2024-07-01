const myFunc = ({ x, y, z }) => {
    console.log(x, y, z);               // undefined undefined undefined
};

myFunc(1, 2, 3);

/*
myFunc expects an object with properties x, y and z as its argument. 

Since we're only passing three separate numeric values (1, 2, 3) instead of one object with properties x, y and z ({x: 1, y: 2, z: 3}), x, y and z have their default value of undefined.
*/

// sol
myFunc({ x: 1, y: 2, z: 3 })            // 1 2 3


// object destructuring
const obj = { x: 1, y: 2 }

let { x: newVar } = obj

console.log(newVar)
// console.log(x)                          // ReferenceError: x is not defined

let { x: ok, y: ok2 } = obj

console.log(ok)
console.log(ok2)