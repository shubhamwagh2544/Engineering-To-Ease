const globalVar = "abc"; // Global variable

// Parent self-invoking function
(function outerFunction(outerArg) { // start of outerFunction's scope

    const outerFuncVar = 'x'; // Variable declared in outerFunction's function scope   

    // Closure self-invoking function
    (function innerFunction(innerArg) { // start of innerFunction's scope

        const innerFuncVar = "y"; // variable declared in innerFunction's function scope

        console.log(
            "outerArg = " + outerArg + "\n" +
            "outerFuncVar = " + outerFuncVar + "\n" +
            "innerArg = " + innerArg + "\n" +
            "innerFuncVar = " + innerFuncVar + "\n" +
            "globalVar = " + globalVar);

        // end of innerFunction's scope

    })(5); // Pass 5 as parameter to our Closure

    // end of outerFunction's scope

})(7); // Pass 7 as parameter to the Parent function