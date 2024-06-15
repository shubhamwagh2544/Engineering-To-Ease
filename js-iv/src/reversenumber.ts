// 1
function reverseNumber(n: number): number {
    let reverse = 0
    while (n > 0) {
        let rem = n % 10
        reverse = reverse * 10 + rem
        n = Math.floor(n / 10)
    }
    return reverse
}
console.log(reverseNumber(123))                 // TC: O(log10 N)

// 2
function reverseNumber1(n: number): number {
    let numstr = String(n).split('').reverse().join('')
    return Number(numstr)
}
console.log(reverseNumber1(123))                 // TC: O(N)