const obj = {
    name: 'shubham',
    print() {
        console.log(`my name is ${this.name}`)
    },
    call: function () {
        console.log('value of this: ', this)
    }
}

obj.print()             // my name is shubham
obj.call()              // this refers to obj

/*
this in regular functions refer to object upon which they are invoked
value of this: { name: 'shubham', print: [Function: print], call: [Function: call] }
*/