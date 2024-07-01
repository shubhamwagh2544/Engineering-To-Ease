function getAge(...args) {
    console.log(args)
    console.log(typeof args);
}

getAge(21);                     // [ 21 ]
getAge(21, 22);                 // [ 21, 22 ]


/*
The rest parameter (...args) lets us "collect" all remaining arguments into an array. 
An array is an object, so typeof args returns "object"
*/


const arr = []
console.log(typeof arr)         // object