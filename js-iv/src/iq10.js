function call() {
    let a = 10
    //return function call2() {
    function call2() {
        let b = 20
        console.log(a)          // accesses a from the closure (outer function's scope)
        console.log(b)          // accesses 'b' from its own scope
    }
    call2()
}

// does closure happens here => Yes
// we can either return call2 to invoke outside or
// invoke call2 inside call to check

call()