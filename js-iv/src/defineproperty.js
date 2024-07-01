const obj = {}

Object.defineProperty(obj, 'name', {
    value: 'shubham',
    writable: false,
    enumerable: false,
    configurable: false
})

console.log(obj)                // {} [cannot be seen since enumerable is false]
console.log(obj.name)           // shubham

obj.name = 'wagh'
console.log(obj.name)           // shubham [cannot be modified since writable is false]

delete obj['name']
console.log(obj.name)           // shubham [cannot be deleted since configurable is false]

// 2
Object.defineProperty(obj, 'age', {
    value: 25,
    writable: true,
    enumerable: false,
    configurable: false
})

console.log(obj)                // {} [cannot be seen since enumerable is false]
console.log(obj.age)            // 25

obj.age = 100
console.log(obj.age)            // 100 [value modified since writable is  true]

delete obj['age']
console.log(obj['age'])         // 100 [cannot be deleted since configurable is false]

// 3
Object.defineProperty(obj, 'address', {
    value: 'pune mh in',
    writable: false,
    enumerable: true,
    configurable: false
})
console.log(obj)                    // { address: 'pune mh in' } [seen since enumerable is true]
console.log(obj.address)            // pune mh in

obj.address = 'another'
console.log(obj.address)            // [value cannot be modified since writable is  false]

delete obj.address
console.log(obj['address'])         // [cannot be deleted since configurable is false]

// 4
Object.defineProperty(obj, 'admin', {
    value: true,
    writable: false,
    enumerable: false,
    configurable: true
})
console.log(obj.admin)              // true
delete obj.admin                    // [deleted since configurable is true]
console.log(obj.admin)              // undefined


/*
Object.defineProperty allows you to control whether properties are writable, enumerable, or configurable.
You can define getter and setter functions for properties
You can create properties that do not appear during enumeration of the object's properties.
*/

const person = {
    name: 'Lydia'
}

Object.defineProperty(person, 'name', {
    value: 'Margot',
    enumerable: true,
    configurable: true,
    writable: true
})

console.log(person.name)            // Margot
