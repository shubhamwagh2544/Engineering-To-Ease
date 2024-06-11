const person = {
    name: 'Lydia',
    age: 21,
};

// keys
for (const item in person) {
    console.log(item);              // prints keys
}

// keys
Object.keys(person).forEach(key => console.log(key))

// values
Object.values(person).forEach(value => console.log(value))

// entries
Object.entries(person).forEach(item => {            // entries => [key, value]
    console.log(item)
})

// entries
Object.entries(person).forEach(([key, value]) => {
    console.log(key, " ", value)
})

// keys values
for (const item in person) {
    console.log(item, " ", person[item])
}