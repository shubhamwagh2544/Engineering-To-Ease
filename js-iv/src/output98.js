const person = {
    name: 'Lydia',
    age: 21,
};

for (const [x, y] of Object.entries(person)) {
    console.log(x, y);
}

/*
Object.entries(person) returns an array of nested arrays, containing the keys and objects:

[ [ 'name', 'Lydia' ], [ 'age', 21 ] ]

Using the for-of loop, we can iterate over each element in the array, the subarrays in this case. We can destructure the subarrays instantly in the for-of loop, using const [x, y]. x is equal to the first element in the subarray, y is equal to the second element in the subarray.

The first subarray is [ "name", "Lydia" ], with x equal to "name", and y equal to "Lydia", which get logged. The second subarray is [ "age", 21 ], with x equal to "age", and y equal to 21, which get logged.
*/