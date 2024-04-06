function sumofarray(arr) {
    let sum = 0
//    for (let i = 0; i < arr.length; i++) {
//        sum += arr[i]
//    }
    for (let el of arr) {
        sum += el
    }
    console.log(sum)
}

sumofarray([10, -7, 3, -1])

// TC: O(n)
// SC: O(1)         // ignore input and output ds