// 1 : Using Closures
const singleton = (function () {
    let instance;
    function createInstance() {
        const obj = new Object('this is only object')
        return obj
    }
    return {
        getInstance: () => {
            if (!instance) {
                instance = createInstance()
            }
            return instance
        }
    }
})()

const instance1 = singleton.getInstance()
const instance2 = singleton.getInstance()

console.log(instance1 === instance2)                // true

instance1.__proto__.add = function () {
    console.log('add on proto')
}

instance2.add()                                     // add on proto

console.log(instance1 === instance2)                // true


// 2 : Using ES6 classes
class Singleton {
    constructor() {
        if (Singleton.instance) {
            return Singleton.instance
        }
        Singleton.instance = this
        this.data = 'this is only object'
    }
}

const singleInstace1 = new Singleton()
const singleInstace2 = new Singleton()

console.log(singleInstace1 === singleInstace2)      // true


// 3: ES6 modules
let instance;
class SingletonInstance {
    constructor() {
        if (!instance) {
            instance = this
            this.data = 'this is only object'
        }
        return instance
    }
}

const singletonInstance1 = new SingletonInstance()
const singletonInstance2 = new SingletonInstance()

console.log(singletonInstance1 === singletonInstance2)  // true

export default SingletonInstance