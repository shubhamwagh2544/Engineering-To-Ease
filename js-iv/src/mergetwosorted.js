function mergeArrays(arr1, arr2) {
    let merged = [...arr1, ...arr2]
    return merged.sort()
}

const array8a = [1, 3, 5];
const array8b = [2, 4, 6];
console.log(mergeArrays(array8a, array8b));  // Output: [1, 2, 3, 4, 5, 6]