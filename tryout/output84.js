// whether given function is pure function or not ?

function sum(a, b) {
    return a + b;
}

/*
The sum function can be called as pure function for meeting these requirements:

Deterministic: Given the same inputs, it always returns the same output.

No Side Effects: It does not modify any state or interact with the outside world (such as modifying global variables, performing I/O operations, etc.).
*/