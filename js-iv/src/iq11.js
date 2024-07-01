function call() {
    var b = 10
    // var is function scoped (not accessible outside)
}
call()

console.log(b)      // b is not defined
