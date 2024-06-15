// 1
// var a = 1;

// function data() {
//     console.log(a)      // undefined
//     if (!a) {           // a is undefined here due to hoisting (so a is falsy hence a = 10)
//         var a = 10;
//     }

//     console.log(a);     // 10
// }

// data();
// console.log(a);         // 1

// 2

var a = 1;

function data() {
    console.log(a)          // 1          ----TMZ start
    if (!a) {
        let a = 10;         //            ----TMZ end
    }

    console.log(a);         // 1
}

data();
console.log(a);             // 1