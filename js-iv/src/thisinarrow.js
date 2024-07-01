const obj = {
    name: 'shubham',
    arrow: () => {
        console.log(`my name is ${this.name}`)      // undefined
        console.log(this)                           // {}
    },
    arrowanother: (i) => {
        console.log('value of i: ', i)              // 5
        console.log('value of this: ', this)        // {}
    }
}

// obj.arrow()
// obj.arrowanother()                               // value of i: undefined 
// obj.arrowanother(5)

const name = 'wagh'
const objAnother = {
    name: 'shubham',
    arrow: () => {
        console.log(`my name is ${this.name}`)      // undefined
        console.log(this)                           // {}
        console.log(this.name)                      // undefined
    },
    arrowanother: (i) => {
        console.log('value of i: ', i)              // 5
        console.log('value of this: ', this)        // {}
    }
}

// objAnother.arrow()
// objAnother.arrowanother(5)


console.log(this)                                   // {}
this.nam = 'wagh'
const objAnotherAgain = {
    nam: 'shubham',
    arrow: () => {
        console.log(`my name is ${this.name}`)      // undefined
        console.log(this)                           // { nam: 'wagh' }
        console.log(this.name)                      // undefined
        console.log(this.nam)                       // wagh
    },
    arrowanother: (i) => {
        console.log('value of i: ', i)              // 5
        console.log('value of this: ', this)        // { nam: 'wagh' }
    }
}

// objAnotherAgain.arrow()
// objAnotherAgain.arrowanother(5)


this.eid = 123
let employee = {
    eid: "E102",
    ename: "Jack",
    fun: () => {
        console.log('arrow func', this.eid)                 // 123
        const a = function () {
            console.log('inside a', this.eid)               // undefined
        }
        a()
        console.log('end line ->', this.eid)                // 123
        const b = () => {
            console.log('inside b', this.eid)               // 123
        }
        b()
    },
    call() {
        console.log('regular func', this.eid)               // E102
        const b = () => {
            console.log('inside b', this.ename, this.eid)   // Jack E102
            console.log(this)                               // this refers to employee object
        }
        b()
        console.log('end line ->', this.eid)                // E102
    }
}

employee.fun()
employee.call()

console.log(globalThis === this)        // false
console.log(this)                       // { nam: 'wagh', eid: 123 }

/*
Since a is called without an explicit context, this is undefined in strict mode, or the global object in non-strict mode.
However, if running in a module (strict mode by default), this will be undefined, hence this.eid will be undefined.
*/