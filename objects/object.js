let obj = {
    a: 1,
    b: 2,
    c: 3
}

for (let key in obj) {
    console.log(key, ": ", obj[key])
}

// for (let [key, value] of obj) {
//     console.log(key, " ", obj[value])            //error
// }

Object.keys(obj).forEach((key) => console.log(key))
Object.values(obj).forEach((val) => console.log(val))

Object.entries(obj).forEach((entry, index) => {
    console.log("entry at index ", index, " is: ", entry)
})

Object.entries(obj).forEach(([key, value]) => {
    console.log(key, " : ", value)
})

let o = {
    1: 'sdsd',
    2: 'dsads',
    true: true,
    1.1: 'dsadas',
    "three": 'hehe'
}

// add object prop
o.oneOtherProp = [1, 2, 3]
o.twoOtherProp = 11.11

console.log(o[2])           //works
console.log(o["1.1"])       //works
console.log(o["three"])       //works
//console.log(o[three])       //error:not defined
console.log(o)

// delete object prop
delete o.oneOtherProp
console.log(o)

o.oneOtherFunctionProp = function add() {
    return 1 + 1
}
console.log(o)
console.log(o.oneOtherFunctionProp())   //2
