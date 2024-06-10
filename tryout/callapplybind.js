function callme(arg1, arg2) {
    // console.log(this)                   // global context
    return arg1 + arg2 + this.arg3
}

console.log(callme(1, 3))                   // NaN

// to change context of global to some other object
// 1
const obj = {
    arg3: 10
}
console.log(callme.call(obj, 10, 20))       // 40

const obj2 = {
    arg4: 10
}
console.log(callme.call(obj2, 10, 20))      // NaN (since this.arg3 is undefined now)

// 2
console.log(callme.apply(obj, [10, 20]))    // 40

// 3
const anotherFunc = callme.bind(obj, 10, 20)
console.log(anotherFunc())                  // 40