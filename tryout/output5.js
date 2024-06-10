/*
which is true ?
A: mouse.bird.size is not valid
B: mouse[bird.size] is not valid
C: mouse[bird["size"]] is not valid
D: All of them are valid
*/

const bird = {
    size: 'small',
};

const mouse = {
    name: 'Mickey',
    small: true,
};

//console.log(mouse.bird.size)        //error: mouse.bird is undefined => undefined.size throws error    
console.log(mouse[bird.size])       // bird.size is small => mouse[small] === mouse['small'] = true
console.log(mouse[bird["size"]])    // bird.size is small => mouse[small] === mouse['small'] = true
console.log(mouse[bird.size.name])  // bird.size is small => 'small'.name is undefined
//console.log(mouse[bird.name.size])  // error: bird.name is undefined => undefined.size throws error

console.log(mouse[undefined])       // undefined
console.log(mouse['undefined'])     // undefined
console.log(mouse['true'])          // undefined
console.log(mouse[true])            // undefined

/*
In JavaScript, all object keys are strings (unless it's a Symbol). 
Even though we might not type them as strings, they are always converted into strings under the hood.
*/