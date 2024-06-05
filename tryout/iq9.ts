/*
var arrayList =  ['a', 'b', 'c', 'd', 'e', 'f'];
How can we empty the array above ?
*/

function emptyArray(arr: string[]) {
    // delete arr[0]                           // [ <1 empty item>, 'b', 'c', 'd', 'e', 'f' ]

    // 1
    // arr = []

    // 2
    // let anotherArr = arr                       // reference to arr is shared with newarr
    // arr = []                                   // [] (arr now references empty array)
    // console.log(anotherArr)                    // ['a', 'b', 'c', 'd', 'e', 'f'];

    // 3
    // arr.length = 0
    // console.log(arr)

    // 4

}

emptyArray(['a', 'b', 'c', 'd', 'e', 'f'])