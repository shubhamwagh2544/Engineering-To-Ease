// 1
function countDigits(n: number): number {
    if (typeof n === 'number') {
        return String(n).length             // TC: O(n)
    }
    else return -1
}
console.log(countDigits(12433))

// 2
function countDigits1(n: number): number {
    let count = 0
    while (n > 0) {
        count++
        n = Math.floor(n / 10)              // TC: O(log10 N)
    }
    return count
}
console.log(countDigits1(12345))

// 3
function countDigits2(n: number): number {
    return Math.floor(Math.log10(n) + 1)    // TC: O(1)
}
console.log(countDigits2(12345))