// what will be logged to console ?

fetch('https://www.website.com/api/user/1')
    .then(res => res.json())
    .then(res => console.log(res));

/*
The value of res in the second .then is equal to the returned value of the previous .then. You can keep chaining .then like this, where the value is passed to the next handler.
*/


//Which option is a way to set hasName equal to true, provided you cannot pass true as an argument?
function getName(name) {
    const hasName = //?
        !!name
}

/*
With !!name, we determine whether the value of name is truthy or falsy. If the name is truthy, which we want to test for, !name returns false. !false (which is what !!name practically is) returns true.

By setting hasName equal to name, you set hasName equal to whatever value you passed to the getName function, not the boolean value true.

new Boolean(true) returns an object wrapper, not the boolean value itself.

name.length returns the length of the passed argument, not whether it's true.
*/


// 3: guess the output
console.log('I want pizza'[0]);         // I