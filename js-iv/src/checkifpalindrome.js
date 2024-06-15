// 1
function checkIfPalindrome(n) {
    let str = String(n)
    for (let i = 0; i < str.length / 2; i++) {
        if (str.charAt(i) != str.charAt(str.length - i - 1)) {
            return false
        }
    }
    return true
}
console.log(checkIfPalindrome(12321))                   // TC: O(n)

// 2
function checkIfPalindrome1(n) {
    let original = n
    let reverse = 0
    while (n > 0) {
        let rem = n % 10
        reverse = reverse * 10 + rem
        n = Math.floor(n / 10)
    }
    if (original === reverse) {
        return true
    }
    else return false
}
console.log(checkIfPalindrome1(12321))                  // TC: O(log10 N)