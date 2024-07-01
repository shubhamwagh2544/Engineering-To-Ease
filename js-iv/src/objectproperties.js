const obj = {
    name: 'shubham'
}

console.log(obj.name)       // shubham
obj.name = null
console.log(obj.name)       // null

delete obj['name']
console.log(obj.name)       // undefined