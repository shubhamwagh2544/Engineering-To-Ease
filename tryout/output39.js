let person = {
    name: 'Lydia'
};
const members = [person];
person = null;

console.log(members);

/*
First, we declare a variable person with the value of an object that has a name property.

Then, we declare a variable called members. We set the first element of that array equal to the value of the person variable. Objects interact by reference when setting them equal to each other. When you assign a reference from one variable to another, you make a copy of that reference. (note that they don't have the same reference!)

We are only modifying the value of the person variable, and not the first element in the array, since that element has a different (copied) reference to the object

When we log the members array, the first element still holds the value of the object, which gets logged.
*/

let obj = { a: 1, b: 2 };
let arr = [obj];        // The array holds a reference to the object

console.log(arr[0]);    // { a: 1, b: 2 }

obj = null;             // Set the variable `obj` to null

console.log(arr[0]);    // { a: 1, b: 2 } (the array still holds the reference to the original object)
console.log(obj);       // null

/*
When you set obj to { a: 1, b: 2 }, it creates an object in memory and obj holds a reference to that object.

When you push obj into the array arr, the array holds a reference to the same object.

Setting obj to null changes the reference held by the variable obj, but it does not affect the reference held by the array. The array still holds the reference to the original object.

                       |-----obj
{ a: 1, b: 2 }---------
                       |------arr[0]
*/