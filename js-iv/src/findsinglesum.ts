// 111 => 3
// 129 => 3

// solution

function findSum(n: number): number {
    let sum = 0;
    while (n > 0) {                     // n > 0 to avoid negatives
        let rem = n % 10
        sum += rem
        n = Math.floor(n / 10)          // floor to avoid floating numbers
    }
    return sum
}

function getSingleSum(n: number): number {
    while (n > 9) {
        n = findSum(n)
    }
    return n
}

console.log(getSingleSum(132))