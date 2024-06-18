// 1
function isPrime(n) {
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

function listOfPrimes(n) {
    const res = []
    for (let i = 2; i <= n; i++) {
        if (isPrime(i)) {
            res.push(i)
        }
    }
    return res
}
console.log(listOfPrimes(19))               // TC: O(sqrt(n)) + O(n) => O(n^3/2)


// 2: sieve of eratosthenes
// TODO
