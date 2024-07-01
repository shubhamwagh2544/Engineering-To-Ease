import * as sum from './sum.js';


// How can we invoke sum in sum.js in index.js?

console.log(sum)            // { default: [Function: sum] }

// sol
console.log(
    sum.default(10)         // 20
)


import * as info from './info.js';

console.log(info)

/*
    {
        default: 'I love JavaScript',
        age: 21,
        name: 'Lydia'
    }
*/

console.log(info.default)