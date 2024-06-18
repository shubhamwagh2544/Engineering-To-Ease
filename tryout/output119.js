const person = {
    name: 'Lydia',
    age: 21,
};

const changeAge = (x = { ...person }) => (x.age += 1);
const changeAgeAndName = (x = { ...person }) => {
    x.age += 1;
    x.name = 'Sarah';
};

changeAge(person);                          // { name: 'Lydia', age: 22 }
changeAgeAndName();

console.log(person);

// solution to change name and age
changeAgeAndName(person)                    // { name: 'Sarah', age: 23 }

console.log(person);

/*
Both the changeAge and changeAgeAndName functions have a default parameter, namely a newly created object { ...person }. This object has copies of all the key/values in the person object.

First, we invoke the changeAge function and pass the person object as its argument. This function increases the value of the age property by 1. person is now { name: "Lydia", age: 22 }.

Then, we invoke the changeAgeAndName function, however we don't pass a parameter. Instead, the value of x is equal to a new object: { ...person }. Since it's a new object, it doesn't affect the values of the properties on the person object. person is still equal to { name: "Lydia", age: 22 }.
*/