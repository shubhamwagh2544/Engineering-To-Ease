function outerFunction() {
    let globalCount = 0;

    function incrementCount() {
        let incrementedValue = ++globalCount;
        return incrementedValue;
    }

    return { incrementCount };
}

const counter = outerFunction();

console.log(counter.incrementCount());                  // 1
console.log(counter.incrementCount());                  // 2
console.log(outerFunction().incrementCount());          // 1

/*
outerFunction function defines a variable globalCount and a nested function incrementCount which increments and returns the globalCount value.
The incrementCount function forms a closure over globalCount.

The outerFunction returns an object containing the incrementCount function.

When you call outerFunction(), it creates a new scope with its own globalCount variable initialized to 0.
Each call to outerFunction() creates a new instance of the function scope with a new globalCount variable.

1st call: outerFunction is called, creating a new scope with globalCount set to 0. The returned object { incrementCount } holds a reference to this scope. The incrementCount function increments globalCount to 1 and returns 1.

2nd call: The incrementCount function increments globalCount to 2 and returns 2.

3rd call: outerFunction() is called again, creating a new scope with a new globalCount set to 0. The returned object { incrementCount } holds a reference to this new scope. incrementCount is called, increments the new globalCount to 1, and returns 1.
*/