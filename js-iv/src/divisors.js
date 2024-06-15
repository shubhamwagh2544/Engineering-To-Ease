// 1
function findAllDivisors(n) {
    const res = []
    for (let i = 1; i <= n; i++) {
        if (n % i === 0) {
            res.push(i)
        }
    }
    return res
}
const res1 = findAllDivisors(36)        // TC: O(n)
console.log(res1)

// 2
function findAllDivisors1(n) {
    const res = []
    for (let i = 1; i <= Math.sqrt(n); i++) {
        if (n % i === 0) {
            if (Math.floor(n / i) === i) {
                res.push(i)
                break;
            }
            res.push(i)
            res.push(Math.floor(n / i))
        }
    }
    return res
}
const res2 = findAllDivisors1(36)       // TC: O(sqrt(n))
console.log(res2)

console.log(res1.length === res2.length)