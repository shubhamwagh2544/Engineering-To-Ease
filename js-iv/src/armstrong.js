function isArmStrongNumber(n) {
    let digits = String(n).length
    let num = n
    let res = 0
    while (n > 0) {
        let rem = n % 10
        res += Math.pow(rem, digits)
        n = Math.floor(n / 10)
    }
    return num === res
}
console.log(isArmStrongNumber(153))         // TC: O(log10 N)