function bark() {
    console.log('Woof!');
}

bark.animal = 'dog';            // no issue here

console.log(bark.animal)        // animal
console.log(bark)               // [Function: bark] { animal: 'dog' }


/*
This is possible in JavaScript, because functions are objects! 
Everything besides primitive types are objects.
A function is a special type of object. The code you write yourself isn't the actual function. 
The function is an object with properties. This property is invocable.
*/