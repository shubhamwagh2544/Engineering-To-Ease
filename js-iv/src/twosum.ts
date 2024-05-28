function twoSum(arr: number[], target: number) {
    const map = new Map()
    for (let i = 0; i < arr.length; i++) {
        const diff = target - arr[i]
        if (map.has(diff)) {
            return {
                a: i,
                b: map.get(diff)
            }
        }
        map.set(arr[i], i)
    }
}

function twoSum1(arr: number[], target: number) {
    // sort and check at both ends
    arr.sort((a, b) => a - b);                  // the sort() function sorts values as strings
    console.log(arr);
}

const nums1: number[] = [2, 7, 15, 11, 3];
const target1: number = 22;
/*let obj = twoSum(nums1, target1)
if (obj) {
    console.log(obj)
}
else {
    console.log('no sum found')
}*/
// Output: [0, 1]


twoSum1(nums1, target1)