let name = 'wagh'

let obj = {
    name: 'shubham',
    age: 25
}

console.log(obj)

// how can we add 'wagh' as key to object which should change as name variable value changes?

obj = {
    [name]: 'shubham',
    age: 25
}
console.log(obj)

//2
let temp = 'wagh'
const anotherObj = {
    name: 'shubham',
    age: 25
}

anotherObj.temp = 20            // static property assignment using dot operator
anotherObj[temp] = 30           // dynamic property assignment using square brackets

console.log(anotherObj)

/*
diff between . operator and [] operator
- The dot operator is used directly with the property name => static property assignment
- The bracket notation uses the property name as a string, which allows for dynamic property names => dynamic property assignment
*/