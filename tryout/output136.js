const randomValue = 21;

function getInfo() {
    console.log(typeof randomValue);
    const randomValue = 'Lydia Hallie';
}

getInfo();          // ReferenceError: Cannot access 'randomValue' before initialization

/*
Variables declared with the const keyword are not referenceable before their initialization: this is called the temporal dead zone. 

In the getInfo function, the variable randomValue is scoped in the functional scope of getInfo. On the line where we want to log the value of typeof randomValue, the variable randomValue isn't initialized yet: a ReferenceError gets thrown! The engine didn't go down the scope chain since we declared the variable randomValue in the getInfo function.
*/