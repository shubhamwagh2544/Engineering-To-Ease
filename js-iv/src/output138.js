const emojis = ['🥑', ['✨', '✨', ['🍕', '🍕']]];

console.log(emojis.flat(1));            // [ '🥑', '✨', '✨', [ '🍕', '🍕' ] ]

/*
With the flat method, we can create a new, flattened array. The depth of the flattened array depends on the value that we pass. 

In this case, we passed the value 1 (which we didn't have to, that's the default value), meaning that only the arrays on the first depth will be concatenated. ['🥑'] and ['✨', '✨', ['🍕', '🍕']] in this case. Concatenating these two arrays results in ['🥑', '✨', '✨', ['🍕', '🍕']].
*/

// flat vs flatmap
const arr = [1, 2, 3, 4]

const newarr = arr.flatMap((val) => [val + 1])
console.log(newarr)

const arr1 = [1, 2, [3, 4, [5, 6]]]
console.log(arr1.flat(2))                   // [ 1, 2, 3, 4, 5, 6 ]

/*
flatmap is a combination of the map and flat methods. It first maps each element using a mapping function, then flattens the result into a new array. The flatMap method only flattens the array by one level.

flat function Flattens an array to a specified depth. It does not apply any mapping function.
*/

const str = ["it's Sunny in", "", "California"]
console.log(str.flatMap(str => str.split(" ")))     // [ "it's", 'Sunny', 'in', '', 'California' ]