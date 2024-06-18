const add = x => y => z => {
    console.log(x, y, z);               // 4 5 6
    return x + y + z;
};

add(4)(5)(6);                           // function currying

/*
The add function returns an arrow function, which returns an arrow function, which returns an arrow function. 

The first function receives an argument x with the value of 4. We invoke the second function, which receives an argument y with the value 5. Then we invoke the third function, which receives an argument z with the value 6. When we're trying to access the value x, y and z within the last arrow function, the JS engine goes up the scope chain in order to find the values for x and y accordingly. 

This returns 4 5 6.
*/