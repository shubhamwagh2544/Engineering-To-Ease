(() => {
    let x, y;
    try {
        throw new Error();
    } catch (x) {
        (x = 1), (y = 2);
        console.log(x);
    }
    console.log(x);
    console.log(y);
})();

/*
x = 1 assigns the value 1 to the x variable scoped within the catch block.
y = 2 assigns the value 2 to the y variable declared in the outer scope of the IIFE.

console.log(x); prints the value of x within the catch block, which is 1.

console.log(x); prints the value of the outer x variable. Since this x was not assigned any value outside the catch block, it remains undefined.

console.log(y); prints the value of the y variable, which was assigned 2 within the catch block.

The catch block receives the argument x. This is not the same x as the variable when we pass arguments. This variable x is block-scoped.

Later, we set this block-scoped variable equal to 1, and set the value of the variable y. Now, we log the block-scoped variable x, which is equal to 1.

Outside of the catch block, x is still undefined, and y is 2. When we want to console.log(x) outside of the catch block, it returns undefined, and y returns 2.
*/