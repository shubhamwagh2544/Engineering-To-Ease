const map = new Map([[1, 'shubham'], [2, 'wagh']])
console.log(map)

map.set('three', 3)
console.log(map)

console.log(map.get(1))
console.log(map.get(3))     // undefined

console.log(map.delete(1))  // true
console.log(map.delete(3))  // false

map.clear()
console.log(map)    // {}

if (map.has(1)) {
    console.log('found')
}

map.set(1, 1)
map.set(2, 2)
map.set(3, 3)

const keys = Array.from(map.keys())
keys.forEach(key => console.log(key))

const values = Array.from(map.values())
values.forEach(val => console.log(val))

const entries = Array.from(map.entries())
entries.map(([key, val]) => console.log(key, " ", val))


for (let [key, val] of map) {
    console.log(key, " ", val)
}