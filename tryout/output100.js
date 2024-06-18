function nums(a, b) {
    if (a > b) console.log('a is bigger');
    else console.log('b is bigger');
    return
    a + b;
}

console.log(nums(4, 2));
console.log(nums(1, 2));

/*
a is bigger
undefined
b is bigger
undefined

In JavaScript, we don't have to write the semicolon (;) explicitly, however the JavaScript engine still adds them after statements. This is called Automatic Semicolon Insertion. A statement can for example be variables, or keywords like throw, return, break, etc.

Here, we wrote a return statement, and another value a + b on a new line. However, since it's a new line, the engine doesn't know that it's actually the value that we wanted to return. Instead, it automatically added a semicolon after return. You could see this as:

return;
a + b;

This means that a + b is never reached, since a function stops running after the return keyword. If no value gets returned, like here, the function returns undefined. Note that there is no automatic insertion after if/else statements!
*/