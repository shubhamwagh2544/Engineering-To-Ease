function swapvariables(a, b) {
    console.log(a, b)
    
    let temp = a
    a = b
    b = temp
    
    console.log(a, b)
}
swapvariables(10, 20)

function swapvariablesWithoutTemp(a, b) {
    console.log(a, b)
    
    a = a * b   // 200
    b = a / b   // 10
    a = a / b   // 20
    
    console.log(a, b)
}
swapvariablesWithoutTemp(10, 20)

function swapvariablesWithoutTempUsingAddition(a, b) {
    console.log(a, b)
    
    a = a + b   // 30
    b = a - b   // 10
    a = a - b   // 20
    
    console.log(a, b)
}
swapvariablesWithoutTempUsingAddition(10, 20)

function swapvariablesWithoutTempUsingXOR(a, b) {
    console.log(a, b)
    
    a = a ^ b   // 30
    b = a ^ b   // 10
    a = a ^ b   // 20
    
    console.log(a, b)
}
swapvariablesWithoutTempUsingXOR(10, 20)

function swapvariablesWithoutTempUsingDestructuring(a, b) {
    console.log(a, b)
    
    [a, b] = [b, a]
    
    console.log(a, b)
}
swapvariablesWithoutTempUsingDestructuring(10, 20)