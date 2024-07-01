const obj = {
    name: 'sh',
    age: 25
}

console.log(obj.name)       // sh
console.log(obj.age)        // 25

delete obj.name
delete obj['age']

console.log(obj.name)       // undefined
console.log(obj.age)        // undefined