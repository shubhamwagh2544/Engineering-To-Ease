console.log(
    +true                   // 1
);

console.log(
    +false                  // 0
)

console.log(
    -true                   // -1
)

console.log(
    -false                  // -0
)

console.log(
    !'Lydia'                // 'Lydia' =>  true
)

/*
unary plus tries to convert an operand to a number. true is 1, and false is 0.
string 'Lydia' is a truthy value. negating truthy value return false
*/