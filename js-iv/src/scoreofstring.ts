/*
You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.
Return the score of s.
Input: s = "hello"
Output: 13
*/

function scoreOfString(s: string): number {
    let total: number = 0
    for (let i = 0; i < s.length - 1; i++) {
        total += Math.abs(s.charCodeAt(i) - s.charCodeAt(i + 1))
    }
    return total
}

console.log(scoreOfString('hello'))
console.log(scoreOfString('zaz'))