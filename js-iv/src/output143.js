const person = { name: 'Lydia Hallie' };

Object.seal(person);

// Which of the following will modify the person object?
person.name = "Evan Bacon"
// person.age = 21
// delete person.name
// Object.assign(person, { age: 21 })

/*
With Object.seal we can prevent new properties from being added, or existing properties to be removed.

However, you can still modify the value of existing properties.
*/

// sol
person.name = "Evan Bacon"      // can modify existing prop
