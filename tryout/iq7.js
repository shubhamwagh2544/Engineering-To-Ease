console.log(letVariable)
let letVariable = 10          // reference-error: cannot access before initialisation

console.log(constVariable)
const constVariable;
// needs to be initialised first => SyntaxError: Missing initializer in const declaration
// when initialised, then => reference-error: cannot access before initialisation