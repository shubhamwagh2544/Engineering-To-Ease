const name = 'Lydia Hallie';
const age = 21;

console.log(Number.isNaN(name));            // false
console.log(Number.isNaN(age));             // false

console.log(isNaN(name));                   // true
console.log(isNaN(age));                    // false

/*
With the Number.isNaN method, you can check if the value you pass is a numeric value and equal to NaN. name is not a numeric value, so Number.isNaN(name) returns false. age is a numeric value, but is not equal to NaN, so Number.isNaN(age) returns false.

With the isNaN method, you can check if the value you pass is not a number. name is not a number, so isNaN(name) returns true. age is a number, so isNaN(age) returns false.
*/