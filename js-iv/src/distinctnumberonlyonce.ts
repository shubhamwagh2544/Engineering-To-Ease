/*
given n number of arrays find distinct elements that appears only once
Input: [[1,2,3], [2,3,4], [3,4,5]] 
Output: [1, 5]
*/

function findDistinctNumberOnlyOnce(arr: number[][]) {
    const res: { [key: string]: number } = {}
    arr.flat(1).forEach((el: number) => res[el] = (res[el] || 0) + 1)
    console.log(res)
    const result = Object.keys(res).filter(key => res[key] === 1)
    console.log(result.map(Number))
}

findDistinctNumberOnlyOnce([[1, 2, 3], [2, 3, 4], [3, 4, 5]])