// What's its value?
console.log('❤️' === '❤️');                 // true

/*
Under the hood, emojis are unicodes. The unicodes for the heart emoji is "U+2764 U+FE0F". These are always the same for the same emojis, so we're comparing two equal strings to each other, which returns true.
*/

// Which of these methods modifies the original array?
const emojis = ['✨', '🥑', '😍'];

emojis.map(x => x + '✨');
emojis.filter(x => x !== '🥑');
emojis.find(x => x !== '🥑');
emojis.reduce((acc, cur) => acc + '✨');
emojis.slice(1, 2, '✨');
emojis.splice(1, 2, '✨');

/*
With splice method, we modify the original array by deleting, replacing or adding elements. In this case, we removed 2 items from index 1 (we removed '🥑' and '😍') and added the ✨ emoji instead.

map, filter and slice return a new array, find returns an element, and reduce returns a reduced value.
*/

// What's its value?
const food = ['🍕', '🍫', '🥑', '🍔'];
const info = { favoriteFood: food[0] };

info.favoriteFood = '🍝';

console.log(food);                          // [ '🍕', '🍫', '🥑', '🍔' ]

/*
We set the value of the favoriteFood property on the info object equal to the string with the pizza emoji, '🍕'. A string is a primitive data type. In JavaScript, primitive data types don't interact by reference.

In JavaScript, primitive data types (everything that's not an object) interact by value. In this case, we set the value of the favoriteFood property on the info object equal to the value of the first element in the food array, the string with the pizza emoji in this case ('🍕'). A string is a primitive data type, and interact by value (see my blogpost if you're interested in learning more)

Then, we change the value of the favoriteFood property on the info object. The food array hasn't changed, since the value of favoriteFood was merely a copy of the value of the first element in the array, and doesn't have a reference to the same spot in memory as the element on food[0]. When we log food, it's still the original array, ['🍕', '🍫', '🥑', '🍔'].
*/