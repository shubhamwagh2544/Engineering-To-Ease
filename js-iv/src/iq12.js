let a = 10;
console.log("line number 2", a);

function fn() {
    console.log("line number 4", a);        // ReferenceError: Cannot access 'a' before initialization
    let a = 20;
    a++;
    console.log("line number 7", a);

    if (a) {
        let a = 30;
        a++;
        console.log("line number 11", a);
    }

    console.log("line number 13", a);
}

fn();
console.log("line number 16", a);