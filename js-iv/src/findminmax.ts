function findMax(arr: number[]): number {
    /*let max = -Infinity
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i]
        }
    }
    return max*/

    return Math.max(...arr)
}

function findMin(arr: number[]): number {
    /*let min = Infinity
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i]
        }
    }
    return min*/

    return Math.min(...arr)
}

const array1: number[] = [1, 3, 7, 2, 5];
console.log(findMax(array1));  // Output: 7

const array2: number[] = [1, 3, 7, 2, 5];
console.log(findMin(array2));  // Output: 1