const user = { name: 'Lydia', age: 21 };
const admin = { admin: true, ...user };

console.log(admin);                         // { admin: true, name: 'Lydia', age: 21 }

/*
It's possible to combine objects using the spread operator .... It lets you create copies of the key/value pairs of one object, and add them to another object. In this case, we create copies of the user object, and add them to the admin object. The admin object now contains the copied key/value pairs, which results in { admin: true, name: "Lydia", age: 21 }.
*/