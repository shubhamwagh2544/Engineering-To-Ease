// 1
function isPrime(n) {
    let count = 0;                          // prime has only 2 divisors (1 & no itself)
    for (let i = 1; i <= n; i++) {
        if (n % i === 0) {
            count++
        }
    }
    if (count === 2) return true
    else return false
}
console.log(isPrime(2))
console.log(isPrime(10))
console.log(isPrime(19))                    // TC: O(n)

// 2
function isPrime1(n) {
    let count = 0
    for (let i = 1; i <= Math.sqrt(n); i++) {
        if (n % i === 0) {
            count++
            if (n / i !== i) {
                count++
            }
        }
    }
    if (count === 2) return true
    else return false
}
console.log(isPrime(2))
console.log(isPrime(10))
console.log(isPrime(19))                    // TC: O(sqrt(n))