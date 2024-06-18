const person = {
    name: 'Lydia Hallie',
    address: {
        street: '100 Main St',
    },
};

Object.freeze(person);

// Which of the following will modify the person object?
// person.name = "Evan Bacon"
// delete person.address
person.address.street = "101 Main St"
// person.pet = { name: "Mara" }

/*
The Object.freeze method freezes an object. No properties can be added, modified, or removed.

However, it only shallowly freezes the object, meaning that only direct properties on the object are frozen. If the property is another object, like address in this case, the properties on that object aren't frozen, and can be modified.
*/

// sol
person.address.street = "101 Main St"
