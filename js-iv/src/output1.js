function sayHi() {
    // -----
    console.log(name);      // undefined
    console.log(age);       // Reference Error: Age is not defined

    var name = 'Lydia';
    // -----                // TDZ => not accessible before the line we declare (initialize) them
    let age = 21;
}

sayHi();

// during hoisting, var is hoisted within function scope and initialized with undefined
// let is hoisted but not initialized.