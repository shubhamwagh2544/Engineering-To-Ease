function removeDuplicates(arr) {
    /*const set = new Set()
    for (let el of arr) {
        set.add(el)
    }
    return Array.from(set)*/
    const set = new Set(arr)
    return [...set]
    //return [...new Set(arr)]
}

const array6 = [1, 3, 7, 2, 5, 3, 7];
console.log(removeDuplicates(array6));  // Output: [1, 3, 7, 2, 5]