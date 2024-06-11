const timeout1 =
    setInterval(() => console.log('setinterval'), 1000)

console.log(timeout1)                    // returns object with timeout details

console.log(timeout1.toString())         // [object Object]


const timeout2 =
    setTimeout(() => console.log('settimeout'), 1000)

console.log(timeout2)                       // returns object with timeout details

console.log(timeout2.toString())            // [object Object]