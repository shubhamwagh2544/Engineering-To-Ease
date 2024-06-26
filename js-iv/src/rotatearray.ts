function rotateArray(arr: number[], steps: number) {
    steps = steps % arr.length
    return arr.slice(-steps).concat(arr.slice(0, -steps))
}
const array10: number[] = [1, 2, 3, 4, 5];
console.log(rotateArray(array10, 2));  // Output: [4, 5, 1, 2, 3]