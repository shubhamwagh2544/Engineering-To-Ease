// Which of the following options will return 6?

function sumValues(x, y, z) {
    return x + y + z;
}

sumValues([...1, 2, 3])
sumValues([...[1, 2, 3]])
sumValues(...[1, 2, 3])                     // works
sumValues([1, 2, 3])

/*
With the spread operator ..., we can spread iterables to individual elements. The sumValues function receives three arguments: x, y and z. ...[1, 2, 3] will result in 1, 2, 3, which we pass to the sumValues function.

...[1, 2, 3] => 1 2 3
*/