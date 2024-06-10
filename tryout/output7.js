let a = 3;
let b = new Number(3);
let c = 3;
let d = new Number(3)

console.log(a == b);            // true
console.log(b == c);            // true
console.log(a === b);           // false
console.log(b === c);           // false
console.log(b == d);            // false
console.log(b === d);           // false

console.log(typeof a)           // number
console.log(typeof b)           // object