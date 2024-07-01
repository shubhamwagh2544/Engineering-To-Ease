function Call() {
    this.name = 'ss'
}

Call.prototype.get = function () {
    console.log('inside prototype', this.name)
}

const call = new Call()
call.get()

call.__proto__.set = function () {
    console.log('inside __proto__', this.name)
}

call.set()

console.log(Call.prototype)     // { get: [Function (anonymous)], set: [Function (anonymous)] }
console.log(call.__proto__)     // { get: [Function (anonymous)], set: [Function (anonymous)] }

console.log(Call.prototype === call.__proto__)          // true