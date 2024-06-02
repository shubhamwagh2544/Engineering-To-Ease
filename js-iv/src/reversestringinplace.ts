/*
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
*/

function reverseStringInPlace(s: string[]): string[] {
    for (let i = 0; i < s.length / 2; i++) {
        let temp = s[i]
        s[i] = s[s.length - i - 1]
        s[s.length - i - 1] = temp
    }
    return s
}

function reverseStringInPlace2(s: string[]): void {
    let left = 0
    let right = s.length - 1

    while (left < right) {
        const temp = s[left]
        s[left] = s[right]
        s[right] = temp
        left++
        right--
    }

    console.log(s)
}

console.log(reverseStringInPlace(["h", "e", "l", "l", "o"]))
reverseStringInPlace2(["h", "e", "l", "l", "o"])