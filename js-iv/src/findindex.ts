function findIndex(arr: number[], el: number): number {
    /*for (let i = 0; i < arr.length; i++) {
        if (arr[i] === el) {
            return i;
        }
    }
    return -1;*/

    //return arr.lastIndexOf(el)
    return arr.indexOf(el)
}

const array5: number[] = [1, 3, 7, 2, 5];
console.log(findIndex(array5, 7));  // Output: 2
console.log(findIndex(array5, 9));  // Output: -1