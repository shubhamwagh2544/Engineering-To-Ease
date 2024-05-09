const set = new Set()
set.add(1)
set.add(2)
set.add(3)
set.add("shubham")
set.add(false)

for (let item of set) {
    console.log(item)
}

const set2 = new Set([1, 2, 3, 3, 3])       // ignores duplicate value
console.log(set2)
set2.forEach((item) => console.log(item))

if (set.has(3)) {
    console.log('item found')
}

const res1 = set.delete(0)
const res2 = set.delete(1)

console.log(res1)   // false
console.log(res2)   // true

console.log(set)

console.log(set.size)
set.clear()
console.log(set.size)

const iterableKeys = Array.from(set2)
Object.keys(iterableKeys).forEach(item => console.log(item))

const iterableValues = Array.from(set2)
Object.values(iterableValues).forEach(item => console.log(item))

const iterableEntries = Array.from(set2)
iterableEntries.forEach((val, index) => {
    console.log(index, " : ", val)
})