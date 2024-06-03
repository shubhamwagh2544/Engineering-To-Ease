/*
Write a mul function which will work properly when invoked with following syntax.
console.log(mul(2)(3)(4)); // output : 24
console.log(mul(4)(3)(4)); // output : 48
*/
function mul(arg1: number) {
    return ((arg2: number) => {
        return ((arg3: number) => {
            return arg1 * arg2 * arg3
        })
    })
}

console.log(mul(2)(3)(4))
console.log(mul(4)(3)(4))

// mul() returns a function that returns another another () => () => ()