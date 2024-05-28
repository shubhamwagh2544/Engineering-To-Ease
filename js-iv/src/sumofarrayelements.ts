function sumArray(arr: number[]): number {
    return arr.reduce((prev, cur) => prev + cur, 0)
}

const array3: number[] = [1, 3, 7, 2, 5];
console.log(sumArray(array3));  // Output: 18