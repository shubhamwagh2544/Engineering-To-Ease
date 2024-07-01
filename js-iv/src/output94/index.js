import * as data from './module.js';

console.log(data);

/*
data {
  default: [Function: default],
  name: 'Lydia'
}

With the import * as name syntax, we import all exports from the module.js file into the index.js file as a new object called data is created. In the module.js file, there are two exports: the default export, and a named export. The default export is a function that returns the string "Hello World", and the named export is a variable called name which has the value of the string "Lydia".

The data object has a default property for the default export, other properties have the names of the named exports and their corresponding values.
*/