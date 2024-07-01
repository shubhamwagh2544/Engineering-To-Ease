for (var i = 0; i < 3; i++) {
    setTimeout(() => console.log(i), 1);
}
/*
When var is used, the variable i is hoisted to the function scope (or the global scope if not inside a function). As a result, each setTimeout callback references the same variable i, which ultimately ends up being 3 after the loop completes.
*/

for (let i = 0; i < 3; i++) {
    setTimeout(() => console.log(i), 1);
}
/*
When let is used, as it is block scoped, a new binding of i is created for each iteration of the loop. Each setTimeout callback closes over the correct i value from its respective iteration.
*/

let j = 0
for (j = 0; j < 3; j++) {
    setTimeout(() => console.log(j), 0);
}
/*
When let is declared outside the loop, all asynchronous callbacks reference the same j variable, which will have the value after the loop completes. Declaring let inside the loop ensures that each iteration has its own scoped variable, capturing the correct value for asynchronous callbacks.
*/

let i;                                                  // 3 3 3
function call() {
    // let i                                            // 3 3 3
    for (i = 0; i < 3; i++) {
        setTimeout(() => console.log(i), 1);
    }
}
call()
/*
When let is declared outside the loop, all asynchronous callbacks reference the same j variable, which will have the value after the loop completes. Declaring let inside the loop ensures that each iteration has its own scoped variable, capturing the correct value for asynchronous callbacks.
*/

function call2() {
    for (var i = 0; i < 3; i++) {
        (function (i) {
            setTimeout(() => console.log(i), 1);        // 0 1 2
        })(i);
    }
}
call2()
/*
Here, each iteration of the loop creates a new scope for the variable i inside IIFE. Inside the IIFE, the value of i is preserved in a new scope created by the function.
*/