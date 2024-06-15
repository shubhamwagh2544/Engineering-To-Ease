const arr = [1, 3]

const newarr = [3, 4, ...arr]
console.log(newarr)

const newarr2 = [5, 6, ...newarr, ...[7, 8]]
console.log(newarr2)        // [5, 6, 3, 4, 1, 3, 7, 8]