function intersection(arr1, arr2) {
    return arr1.filter(el => arr2.includes(el))

    /*const res = []
    arr1.forEach(el => {
        if (arr2.includes(el)) {
            res.push(el)
        }
    })
    return res*/
}

const array9a = [1, 3, 5, 7];
const array9b = [3, 5, 9];

console.log(intersection(array9a, array9b));  // Output: [3, 5]