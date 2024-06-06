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