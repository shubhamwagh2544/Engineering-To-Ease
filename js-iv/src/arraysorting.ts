import { measure } from "helpful-decorators";
import quickSort from "./quicksort";

class ArraySorting {
    array: number[] = [];
    constructor(arr: number[]) {
        this.array = arr
    }

    @measure                            // Call to sortWithInBuiltFunction took 0.17 milliseconds.
    sortWithInBuiltFunction() {
        this.array.sort((a, b) => a - b)
        console.log(this.array)
    }

    @measure                            // Call to sortWithQuickSort took 0.07 milliseconds.
    sortWithQuickSort() {
        console.log(quickSort(this.array))
    }
}

const test = new ArraySorting([2, 7, 15, 11, 3])
test.sortWithInBuiltFunction()
test.sortWithQuickSort()