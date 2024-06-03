/*
You are given two strings s and t consisting of only lowercase English letters.
Return the minimum number of characters that need to be appended to the end of s so that t becomes a subsequence of s.
Input: s = "coaching", t = "coding"
Output: 4
Input: s = "abcde", t = "a"
Output: 0
*/

function appendCharacters(s: string, t: string): number {
    // two pointer approach
    // s = coaching
    // t = coding
    let firstpointer = 0;
    let secondpointer = 0;

    while (firstpointer < s.length && secondpointer < t.length) {
        if (s[firstpointer] === t[secondpointer]) {
            firstpointer++
            secondpointer++
        }
        else {
            firstpointer++
        }
    }

    if (firstpointer === 0 && secondpointer === 0) return t.length
    else return t.length - secondpointer
}

console.log(appendCharacters('coaching', 'coding'))