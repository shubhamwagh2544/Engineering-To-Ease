let str = 'abc'

console.log(str[0])                 // a
console.log(str[1])                 // b

console.log(str[3])                 // undefined

str[3] = 'd'
console.log(str)                    // abc

str.toUpperCase()
console.log(str)                    // abc

/*
In JavaScript, strings are immutable. This means that once a string is created, it cannot be changed. Any operation that appears to modify a string actually creates a new string.

This immutability is advantageous in terms of memory efficiency and safety.
*/

let newStr = str.toUpperCase()
console.log(newStr)                 // ABC
console.log(str)                    // abc

let strcon = str + ' ' + newStr
console.log(strcon)                 // abc ABC

let substr = strcon.substring(0, 2)
console.log(substr)                 // ab
console.log(strcon)                 // abc ABC


// how to change character at specific position in string
str = 'abc'
// 1
let arr = str.split('')
arr[3] = 'd'
let strjoin = arr.join('')
console.log(strjoin)                // abcd

//2
let strconcat = str + 'd'
console.log(strconcat)

//3
let array = str.split('')
arr[2] = 'x'
let strjoined = arr.join('')
console.log(strjoined)

//4 : str[2] = z
let newstring = str.substring(0, 2) + 'z' + str.substring(2)
console.log(newstring)              // abzc