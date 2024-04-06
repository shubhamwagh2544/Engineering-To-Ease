function swapvariables(a, b) {
    // before swap
    console.log(a, b)
    
    // with O(1) storage variable
    let temp = a
    a = b
    b = temp
    
    console.log(a, b)
}
swapvariables(10, 20)


function swapvariablesWithoutTemp(a, b) {
    // mathematics
    console.log(a, b)
    
    a = a * b   // 200
    b = a / b   // 10
    a = a / b   // 20
    
    console.log(a, b)
}
swapvariablesWithoutTemp(10, 20)
