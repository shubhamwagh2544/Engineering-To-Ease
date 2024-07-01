class JSClass {

    // public
    name;

    // private
    #private = 10

    constructor(name) {
        this.name = name
    }
    getName() {
        return this.name
    }
    setName(name) {
        this.name = name
    }
    getPrivate() {
        this.#setPrivate()              // can be called inside class only
        return this.#private
    }
    #setPrivate() {
        console.log('this is private method:', this.name)
    }
}

const js = new JSClass('new name')
console.log(js.name)            // shubham wagh
js.setName('harry potter')
console.log(js.getName())       // harry potter

console.log(js.private)         // undefined
console.log(js.getPrivate())

// console.log(js.setPrivate())    // TypeError: setPrivate is not a function