function binarySearch(arr, el) {
    let left = 0
    let right = arr.length - 1

    while (left <= right) {
        const mid = Math.floor(arr[(left + right) / 2])
        if (arr[mid] === el) return mid
        else if (arr[mid] < el) left = mid + 1
        else right = mid - 1
    }
    return -1
}

console.log(binarySearch([1, 2, 3, 4, 5], 3))