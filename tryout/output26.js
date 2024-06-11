const person = { name: 'Lydia' };

function sayHi(age) {
    return `${this.name} is ${age}`;
}

console.log(sayHi.call(person, 21));
console.log(sayHi.apply(person, [21]));
console.log(sayHi.bind(person, 21));            // bind returns a function

/*
bind() returns a copy of the function, but with a bound context! It is not executed immediately.
*/

// 1
const func = sayHi.bind(person, 21)
console.log(func())
// 2
console.log(sayHi.bind(person, 21)());