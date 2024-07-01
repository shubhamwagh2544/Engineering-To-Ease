const info = {
    [Symbol('a')]: 'b',
};

console.log(info);
console.log(Object.keys(info));

/*
    { [Symbol(a)]: 'b' }
    []

A Symbol is not enumerable. The Object.keys method returns all enumerable key properties on an object. The Symbol won't be visible, and an empty array is returned. When logging the entire object, all properties will be visible, even non-enumerable ones.

This is one of the many qualities of a symbol: besides representing an entirely unique value (which prevents accidental name collision on objects, for example when working with 2 libraries that want to add properties to the same object), you can also "hide" properties on objects this way (although not entirely. You can still access symbols using the Object.getOwnPropertySymbols() method).
*/

Object.defineProperty(info, 'name', {
    value: 'shubham',
    enumerable: true,
    // writable: true,
    // configurable: true
})

console.log(info);
console.log(Object.keys(info));

/*
    { name: 'shubham', [Symbol(a)]: 'b' }
    [ 'name' ]
*/