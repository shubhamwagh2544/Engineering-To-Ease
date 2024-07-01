function checkAge(age) {
    if (age < 18) {
        const message = "Sorry, you're too young.";
    } else {
        const message = "Yay! You're old enough!";
    }

    return message;
}

console.log(checkAge(21));              // ReferenceError

/*
Variables with the const and let keywords are block-scoped. A block is anything between curly brackets ({ }). In this case, the curly brackets of the if/else statements. You cannot reference a variable outside of the block it's declared in, a ReferenceError gets thrown.
*/