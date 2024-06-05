/*
Given a string s which consists of lowercase or uppercase letters, return the length of the longest 
palindrome that can be built with those letters.
Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
*/

// frequency array or set
function longestPalindrome(s: string): number {
    // const frequency: { [key: string]: number } = {}
    const set = new Set()
    let res = 0
    for (let char of s) {
        if (set.has(char)) {
            res += 2
            set.delete(char)
        }
        else {
            set.add(char)
        }
    }
    if (set.size !== 0) {
        return res += 1
    }
    else return res
};

console.log(
    longestPalindrome("abccccdd")
)
