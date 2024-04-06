function largestNumberTwiceOfOthers(nums) {
  let max = Math.max(...nums);                  // O(n) 
  let maxIndex = nums.indexOf(max);             // O(n) 
  for (let i = 0; i < nums.length; i++) {       // O(n) 
    if (i !== maxIndex && nums[i] * 2 > max) {  // O(1)
      return -1;                                // O(1)
    }
  }
    return maxIndex;
}

// Time: O(n)
// Space: O(1)
var res = largestNumberTwiceOfOthers([3, 6, 1, 0])    // 1
console.log(res);