function isSorted(arr: number[]): boolean {
    for (let i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
            return false
        }
    }
    return true
}

const array7a: number[] = [1, 2, 3, 4, 5];
const array7b: number[] = [1, 3, 2, 4, 5];
console.log(isSorted(array7a));  // Output: true
console.log(isSorted(array7b));  // Output: false