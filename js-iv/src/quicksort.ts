function quickSort(arr: number[]): number[] {
    if (arr.length <= 1) return arr;

    const pivot = arr[Math.floor(arr.length / 2)]
    const left = arr.filter(el => el < pivot)
    const right = arr.filter(el => el > pivot)
    const middle = arr.filter(el => el === pivot)

    return [...quickSort(left), ...middle, ...quickSort(right)]
}


let numbers = [10, 5, 8, 1, 7];
let sortedNumbers = quickSort(numbers);
console.log(sortedNumbers);  // Output: [1, 5, 7, 8, 10]

export default quickSort