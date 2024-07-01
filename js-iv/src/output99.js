function getItems(fruitList, ...args, favoriteFruit) {
    return [...fruitList, ...args, favoriteFruit]
}

console.log(
    getItems(["banana", "apple"], "pear", "orange")
)

/*
...args is a rest parameter. The rest parameter's value is an array containing all remaining arguments, and can only be the last parameter! 
In this example, the rest parameter was the second parameter. This is not possible, and will throw a syntax error.

SyntaxError: Rest parameter must be last formal parameter
*/

// sol
function getItems1(fruitList, favoriteFruit, ...args) {
    return [...fruitList, ...args, favoriteFruit]
}

console.log(
    getItems1(["banana", "apple"], "pear", "orange")        // [ 'banana', 'apple', 'orange', 'pear' ]
)