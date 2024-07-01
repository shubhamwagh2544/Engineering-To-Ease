/*
    [1, 2, 3, 4] => [24, 12, 8, 6]
*/
function productOfNumbers(arr) {
    // brute
    const res = []
    for (let i = 0; i < arr.length; i++) {
        let prod = 1
        for (let j = 0; j < arr.length; j++) {
            if (i != j) {
                prod *= arr[j]
            }
        }
        res.push(prod)
    }
    return res
}
console.log(productOfNumbers([1, 2, 3, 4]))             // [ O(n2) | O(n) ]


function productOfNumbers1(arr) {
    // better | fails for el = 0 / negative numbers
    let prod = 1
    for (let el of arr) {
        prod *= el
    }
    for (let i = 0; i < arr.length; i++) {
        arr[i] = Math.floor(prod / arr[i])
    }
    return arr
}
console.log(productOfNumbers1([1, 2, 3, 4]))            // [ O(2n) | O(1) ]


function productOfNumbers2(arr) {
    // best
}
console.log(productOfNumbers2([1, 2, 3, 4]))