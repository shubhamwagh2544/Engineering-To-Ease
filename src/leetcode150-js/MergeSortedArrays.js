function mergeTwoSortedArrays(num1, num2) {
    let arr1 = num1.filter((n) => n != 0)
    let arr2 = num2.filter((n) => n != 0)

    let i = 0;
    let j = 0;

    let newarr = []

    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] < arr2[j]) {
            newarr.push(arr1[i])
            i++;
        }
        else {
            newarr.push(arr2[j])
            j++;
        }
    }

    // remaining elements
    while (i < arr1.length) {
        newarr.push(arr1[i])
        i++;
    }
    while (j < arr2.length) {
        newarr.push(arr2[j])
        j++;
    }
    console.log(newarr)
}

function mergeTwoSortedArrays2(num1, num2) {
    // num1 is bigger
    for (let i = num2.length, j = 0; i < num1.length; i++, j++) {
        num1[i] = num2[j];
    }

    num1.sort((a, b) => a - b);
    console.log(num1)
}

mergeTwoSortedArrays2([1, 2, 3, 0, 0, 0], [2, 5, 6])

/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
*/