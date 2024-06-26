const person = {
    name: "Lydia Hallie",
    age: 21
}


// What do we need to add to the person object to get ["Lydia Hallie", 21] as the output of [...person]?

[...person] // ["Lydia Hallie", 21]

/*
Sol: *[Symbol.iterator]() { yield* Object.values(this) }

Objects aren't iterable by default. An iterable is an iterable if the iterator protocol is present. We can add this manually by adding the iterator symbol [Symbol.iterator], which has to return a generator object, for example by making it a generator function *[Symbol.iterator]() {}. This generator function has to yield the Object.values of the person object if we want it to return the array ["Lydia Hallie", 21]: yield* Object.values(this).
*/