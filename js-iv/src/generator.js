function* generator(str) {
    console.log('inside generator func')            // executed once

    yield str

    yield (str + 'hello')

    yield (str.concat('new'))
}


const iterator = generator('world')

console.log(iterator.next())                    // { value: 'world', done: false }

console.log(iterator.next())                    // { value: 'worldhello', done: false }

console.log(iterator.next())                    // { value: 'worldnew', done: false }

console.log(iterator.next())                    // { value: undefined, done: true }

// iterate over generator function

for (let val of generator('val')) {             // generator will execute console logging stmt
    console.log(val)                            // print yielded values
}
// val 
// valhello
// valnew