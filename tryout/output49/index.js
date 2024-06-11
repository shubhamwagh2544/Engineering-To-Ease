import mycounter from './counter.js'

console.log(mycounter)      // 10

mycounter += 1              // Error: Read Only (constant): TypeError: Assignment to constant variable.

console.log(mycounter)

/*
An imported module is read-only: you cannot modify the imported module. Only the module that exports them can change its value.

When we try to increment the value of myCounter, it throws an error: myCounter is read-only and cannot be modified.
*/