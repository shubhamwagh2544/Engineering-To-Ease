// 1
let name = 'Lydia';

function getName() {
    console.log(name);
    let name = 'Sarah';
}

getName();              // ReferenceError: Cannot access 'name' before initialization

// 2
let name = 'Lydia';

function getName() {
    console.log(name); // Logs 'Lydia'
    // Removed the local declaration
}

getName();

// 3
let name = 'Lydia';

function getName() {
    console.log(name); // Logs 'Lydia'
    let localName = 'Sarah';
    console.log(localName); // Logs 'Sarah'
}

getName();

// 4
let name = 'Lydia';

function getName() {
    console.log(name); // Logs 'undefined'
    var name = 'Sarah';
    console.log(name); // Logs 'Sarah'
}

getName();

// 5
let name = 'Lydia';

function getName() {
    console.log(name);  // ReferenceError: Cannot access 'name' before initialization
    let name = 'Sarah';
    console.log(name);
}

getName();