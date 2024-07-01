function getAge() {
    'use strict';
    age = 21;
    console.log(age);
}

getAge();                           // ReferenceError: age is not defined

/*
With "use strict", you can make sure that you don't accidentally declare global variables. We never declared the variable age, and since we use "use strict", it will throw a reference error. If we didn't use "use strict", it would have worked, since the property age would have gotten added to the global object.
*/

function getAge2() {
    age = 21
    'use strict';
    console.log(age);               // 21
}
getAge2()

console.log(globalThis.age)         // 21