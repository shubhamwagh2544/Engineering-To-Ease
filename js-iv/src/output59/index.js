console.log('running index.js');

import { sum } from './sum.js';

console.log(sum(1, 2));

// running sum.js
// running index.js
// 3

/*
With the import keyword, all imported modules are pre-parsed. This means that the imported modules get run first, and the code in the file that imports the module gets executed after.

This is a difference between require() in CommonJS and import! 

With require(), you can load dependencies on demand while the code is being run. If we had used require instead of import, running index.js, running sum.js, 3 would have been logged to the console.
*/