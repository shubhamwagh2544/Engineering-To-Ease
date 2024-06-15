// find duplicates: [1,2,2,3,4,5,6,1]

// 1: using map
function findDuplicates(arr) {
    const map = new Map()
    for (let el of arr) {
        if (map.has(el)) {
            map.set(el, map.get(el) + 1)
        }
        else {
            map.set(el, 1)
        }
    }
    // traverse with for of
    console.log('traverse with for of')
    for (let [key, val] of map) {
        if (val > 1) {
            console.log(key)
        }
    }
    // traverse with map.entries()
    console.log('traverse with map.entries()')
    for (let [key, val] of map.entries()) {
        if (val > 1) {
            console.log(key)
        }
    }
    // traverse with forEach
    console.log('traverse with forEach')
    map.forEach((val, key) => {
        if (val > 1) {
            console.log(key)
        }
    })
}
findDuplicates([1, 2, 2, 3, 4, 5, 6, 1])


// 2: using obj
function findDuplicates1(arr) {
    const obj = {}
    for (let el of arr) {
        obj[el] = (obj[el] || 0) + 1
    }
    // traverse in obj
    console.log('traverse with for in obj')
    for (let key in obj) {
        if (obj[key] > 1) {
            console.log(Number(key))            // keys are string in objects
        }
    }
}
findDuplicates1([1, 2, 2, 3, 4, 5, 6, 1])
