function cll() {
    try {
        console.log('try block')            // executes
    }
    catch (err) {
        console.log('catch block', err)
    }
    finally {
        console.log('finally block')       // executes no matter what
    }
}

cll()