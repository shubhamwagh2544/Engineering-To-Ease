function Person1(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;

    console.log(this)
}

const lydia = new Person1('Lydia', 'Hallie');       // this refers to lydia
const sarah = Person1('Sarah', 'Smith');            // this refers to global object

console.log(lydia);             // Person1 { firstName: 'Lydia', lastName: 'Hallie' }
console.log(sarah);             // undefined

console.log(lydia.firstName)    // Lydia
console.log(sarah.firstName)    // TypeError: Cannot read properties of undefined (reading 'firstName')

/*--------------------*/

function Person2(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;

    console.log(this)

    return { name: 'shubham' }
}

const lydiaa = new Person2('Lydia', 'Hallie');      // this refers to lydiaa
const sarahh = Person2('Sarah', 'Smith');           // this refers to global object

console.log(lydiaa);            // { name: 'shubham' }
console.log(sarahh);            // { name: 'shubham' }

console.log(lydiaa.firstName)   // undefined
console.log(sarahh.firstName)   // undefined

console.log(lydiaa.name)        // shubham
console.log(sarahh.name)        // shubham

/*
In JavaScript, when a constructor function is invoked with the new keyword, it creates a new object and sets the prototype of the new object to the prototype of the constructor function. However, if the constructor function explicitly returns an object, that object will be returned instead of the newly created instance.
*/