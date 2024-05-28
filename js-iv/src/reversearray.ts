function reverseArray(arr: number[]) {
    /*let start = 0
    let end = arr.length - 1

    while (start < end) {
        let temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp

        start++
        end--
    }
    return arr*/

    return arr.reverse()
}

const array4: number[] = [1, 3, 7, 2, 5];
console.log(reverseArray(array4));  // Output: [5, 2, 7, 3, 1]