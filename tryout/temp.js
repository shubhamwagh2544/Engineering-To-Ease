// function gcd(a, b) {
//     let res = 1
//     for (let i = 2; i < Math.min(a, b); i++) {
//         if (a % i === 0 && b % i === 0) {
//             res = i
//             res = Math.max(res, i)
//         }
//     }
//     return res
// }

// console.log(gcd(56, 98))

// 12, 24 => 2

/*
Find two sum problems whch is equal to the target values
    arr 	= [1,7,3,-2, 34, 5, 6, -1]
    target 	= 4
*/

// function twoSum(arr, target) {
//     // sort
//     arr.sort((a, b) => a - b)
//     console.log(arr)

//     // check at both sides if sum matches to target
//     let start = 0
//     let end = arr.length - 1

//     const res = []
//     while (start < end) {
//         if (arr[start] + arr[end] === target) {
//             res.push({ start, end })
//             start++
//             continue
//         }
//         else if (arr[start] + arr[end] > target) {
//             end--
//         }
//         else {
//             start++
//         }
//     }
//     return res
// }

// console.log(
//     twoSum([1, 7, 3, -2, 34, 5, 6, -1], 4)
// )