const obj = {
    name: 'shubham',
    print() {
        console.log(`my name is ${this.name}`)              // shubham
        console.log(this)                                   // this refers to obj (regular func)
        function a() {
            console.log('regular inside regular', this)     // global object
        }
        a()
        const b = () => {
            console.log('arrow inside regular', this)       // this refers to obj
        }
        b()
    },
    call: function () {
        console.log('value of this: ', this)                // this refers to obj (regular func)
    }
}

obj.print()             // my name is shubham
obj.call()              // this refers to obj

/*
this in regular functions refer to object upon which they are invoked
value of this: { name: 'shubham', print: [Function: print], call: [Function: call] }
*/

/*
Since a is called without an explicit context, in non-strict mode, this will refer to the global object (window in browsers or global in Node.js). In strict mode, this will be undefined.

Arrow functions do not have their own this context; they inherit this from their lexical scope. Here, this inside b refers to the same this as in print, which is obj.
*/