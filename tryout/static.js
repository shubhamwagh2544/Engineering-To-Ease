class JS {

    static myProp = 'all'           // 'all' if value not set

    constructor(prop, myProp) {
        JS.myProp = myProp
        this.prop = prop
    }
    static keep() {
        console.log('inside static function')
        console.log(this)           // [class JS]
        console.log(this.name)      // JS
    }

    static callMyProp() {
        return JS.myProp
    }
}

const js = new JS('shubham', 'wagh')
console.log(js.prop)                // shubham
console.log(js.myProp)              // undefined
// js.keep()                        // js.keep is not a function: TypeError

JS.keep()                           // since keep is invoked on JS, this refers to class JS

console.log(JS.name)                // JS
console.log(JS.age)                 // undefined

console.log(JS.callMyProp())        // wagh
console.log(JS.myProp)              // wagh

/*
Static methods and properties are accessed directly on the class, not on instances of the class.
In static methods, this refers to the class itself, not to instances of the class.
Static properties need to be assigned a value or set in the constructor; they can't be declared on their own outside of the constructor.
*/