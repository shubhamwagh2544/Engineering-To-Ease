const name = 'Lydia Hallie';

console.log(!typeof name === 'object');                 // false
console.log(!typeof name === 'string');                 // false

/*
typeof name returns "string". The string "string" is a truthy value, so !typeof name returns the boolean value false. false === "object" and false === "string" both returnfalse.
*/

// sol: If we wanted to check whether the type was (un)equal to a certain type, we should've written !== instead of !typeof

const nme = 'shubham wagh'

console.log(!(typeof name === 'object'));               // true
console.log(!(typeof name === 'string'));               // false