const animals = {};
let dog = { emoji: '🐶' }
let cat = { emoji: '🐈' }

animals[dog] = { ...dog, name: "Mara" }
animals[cat] = { ...cat, name: "Sara" }

console.log(animals[dog])

/*
Output: { emoji: "🐈", name: "Sara" }

Object keys are converted to strings.

Since the value of dog is an object, animals[dog] actually means that we’re creating a new property called "[object Object]" equal to the new object. animals["[object Object]"] is now equal to { emoji: "🐶", name: "Mara"}.

cat is also an object, which means that animals[cat] actually means that we’re overwriting the value of animals["[object Object]"] with the new cat properties.

Logging animals[dog], or actually animals["[object Object]"] since converting the dog object to a string results "[object Object]", returns the { emoji: "🐈", name: "Sara" }.
*/