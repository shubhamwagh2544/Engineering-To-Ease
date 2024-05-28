function maxSubArray(arr: number[]) {
    // contiguous subarray
    let sum: number = -Infinity;
    let maxsum: number = -Infinity;
    for (let i = 0; i < arr.length; i++) {
        sum = Math.max(arr[i], sum + arr[i])
        maxsum = Math.max(sum, maxsum)
    }
    return maxsum
}

const nums2 = [-2, 1, -3, 4, -1, 2, 1, -5, 4];
console.log(maxSubArray(nums2));  // Output: 6