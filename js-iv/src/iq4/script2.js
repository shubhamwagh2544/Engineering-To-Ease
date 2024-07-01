console.log('script 2 start')

const variable = "this is exported variable"

// what is scope of this var
var anotherVariable = "this is var"         // not global scope (module scope)
// without import export, var would be global scope

export { variable }