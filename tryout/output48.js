const set = new Set([1, 1, 2, 3, 4]);

console.log(set);               // Set(4) { 1, 2, 3, 4 }

/*
The Set object is a collection of unique values: a value can only occur once in a set.

We passed the iterable [1, 1, 2, 3, 4] with a duplicate value 1. Since we cannot have two of the same values in a set, one of them is removed. This results in {1, 2, 3, 4}.
*/

// set to array
const arr = Array.from(set)
console.log(arr)                // [1, 2, 3, 4]