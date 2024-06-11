const numbers = [1, 2, 3];
numbers[10] = 11;

console.log(numbers);           // [ 1, 2, 3, <7 empty items>, 11 ]

/*
When you set a value to an element in an array that exceeds the length of the array, JavaScript creates something called "empty slots". These actually have the value of undefined, but you will see something like:

[1, 2, 3, empty x 7, 11]

depending on where you run it (it's different for every browser, node, etc.)
*/


// what is output ?
console.log(3 + 4 + '5');                   // '75'
/*
3 + 4 gets evaluated first. This results in the number 7.
7 + '5' results in "75" because of coercion. JavaScript converts the number 7 into a string
*/


// what is output ?
const num = parseInt('7*6', 10);            // 7
/*
Only the first number in the string is returned. Based on the radix (the second argument in order to specify what type of number we want to parse it to: base 10, hexadecimal, octal, binary, etc.), the parseInt checks whether the characters in the string are valid. Once it encounters a character that isn't a valid number in the radix, it stops parsing and ignores the following characters.

* is not a valid number. It only parses "7" into the decimal 7. num now holds the value of 7.
*/

