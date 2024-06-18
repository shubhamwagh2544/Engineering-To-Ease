// Which method(s) will return the value 'Hello world!'?

const myMap = new Map();
const myFunc = () => 'greeting';

myMap.set(myFunc, 'Hello world!');

//1
myMap.get('greeting');

//2
myMap.get(myFunc);                          // 'Hello world!'

//3
myMap.get(() => 'greeting');

/*
When adding a key/value pair using the set method, the key will be the value of the first argument passed to the set function, and the value will be the second argument passed to the set function. The key is the function () => 'greeting' in this case, and the value 'Hello world'. myMap is now { () => 'greeting' => 'Hello world!' }.

1 is wrong, since the key is not 'greeting' but () => 'greeting'. 

3 is wrong, since we're creating a new function by passing it as a parameter to the get method. Object interacts by reference. Functions are objects, which is why two functions are never strictly equal, even if they are identical: they have a reference to a different spot in memory.
*/