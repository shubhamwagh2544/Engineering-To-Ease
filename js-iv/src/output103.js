const getList = ([x, ...y]) => [x, y]
const getUser = user => { name: user.name, age: user.age }

const list = [1, 2, 3, 4]
const user = { name: "Lydia", age: 21 }

console.log(getList(list))                          // [ 1, [ 2, 3, 4 ] ]
console.log(getUser(user))

/*
The getList function receives an array as its argument. Between the parentheses of the getList function, we destructure this array right away. You could see this as:

[x, ...y] = [1, 2, 3, 4]

With the rest parameter ...y, we put all "remaining" arguments in an array. The remaining arguments are 2, 3 and 4 in this case. The value of y is an array, containing all the rest parameters. The value of x is equal to 1 in this case, so when we log [x, y], [1, [2, 3, 4]] gets logged.

The getUser function receives an object. With arrow functions, we don't have to write curly brackets if we just return one value. However, if you want to instantly return an object from an arrow function, you have to write it between parentheses, otherwise everything between the two braces will be interpreted as a block statement. In this case the code between the braces is not a valid JavaScript code, so a SyntaxError gets thrown.

The following function would have returned an object:

const getUser = user => ({ name: user.name, age: user.age })
*/

// sol
const getUser1 = user => {
    return { name: user.name, age: user.age }
}
const getUser2 = user => ({ name: user.name, age: user.age })

console.log(getUser1(user))                         // { name: 'Lydia', age: 21 }
console.log(getUser2(user))                         // { name: 'Lydia', age: 21 }