// const obj = {}

// Object.assign(obj, { age: 24 })
// Object.assign(obj, { name: 'shubham' })

// console.log(obj)

// // Object.assign is used to copy the values of all enumerable own properties from one or more source objects to a target object.
// // Shallow Copy: Only copies properties and values. Nested objects are copied by reference.

// const obj1 = {
//     nam1: 'sh'
// }
// const obj2 = {
//     nam2: 'sw'
// }

// // Object.assign(obj, [obj1, obj2])
// Object.assign(obj, ...[obj1, obj2])

// console.log(obj)

// import fs from 'fs';

// // Create a readable stream
// const readableStream = fs.createReadStream('info.txt', { encoding: 'utf8' });

// // create a writable stream
// const writableStream = fs.createWriteStream('output.txt');

// // Listen for data events
// readableStream.on('data', (chunk) => {
//     console.log('Received chunk:', chunk);
// });

// // Listen for end event
// readableStream.on('end', () => {
//     console.log('No more data.');
// });

// // Handle errors
// readableStream.on('error', (err) => {
//     console.error('An error occurred:', err.message);
// });

// // Write some data
// writableStream.write('Hello, World!\n');
// writableStream.write('Writing to a stream is easy.\n');

// // End the stream
// writableStream.end('This is the end of the stream.');

// // Listen for finish event
// writableStream.on('finish', () => {
//     console.log('All data has been written.');
// });

// // Handle errors
// writableStream.on('error', (err) => {
//     console.error('An error occurred:', err.message);
// });


// // Create a new WebSocket connection
// const ws = new WebSocket('wss://example.com/socket');

// // Define a custom event listener
// function customEventListener(event) {
//     console.log('Custom event triggered:', event.detail);
// }

// // Add the custom event listener for a custom event type 'customEvent'
// ws.addEventListener('customEvent', customEventListener);

// // Add a listener for the 'open' event
// ws.addEventListener('open', (event) => {
//     console.log('WebSocket connection opened.');

//     // Dispatch a custom event when the WebSocket is opened
//     const customEvent = new CustomEvent('customEvent', { detail: 'Connection successfully opened' });
//     ws.dispatchEvent(customEvent);
// });

// // Add a listener for the 'message' event
// ws.addEventListener('message', (event) => {
//     console.log('Message from server:', event.data);
// });

// // Add a listener for the 'error' event
// ws.addEventListener('error', (event) => {
//     console.error('WebSocket error:', event);
// });

// // Add a listener for the 'close' event
// ws.addEventListener('close', (event) => {
//     console.log('WebSocket connection closed.');
// });


// const obj = {
//     name: 'shubham',
//     id: 1
// }

// Object.prototype.add = function () {
//     console.log('ok')
// }
// obj.add()                   // ok

// const newobj = Object.create(obj)

// console.log(newobj.name)    // shubham
// newobj.add()                // ok

// const arr = [1, 3, 3, { name: 'sh' }]
// console.log(typeof arr)
// console.log(Object.keys(arr))       // hence js array can store any data type since its object internally
// console.log(Object.values(arr))


// // How would you flatten a nested object in JavaScript?

// let obj = {
//     name: 'shubham',
//     address: {
//         city: 'pune'
//     }
// }
// console.log(obj)

// /*
// {
// name:"shubham"
// "address.city":"pune"
// }
// */

// let newobj = {}
// for (let [key, value] of Object.entries(obj)) {
//     if (typeof value === 'object') {
//         let o = Object.keys(value)
//         let newkey = key + '.' + o[0]
//         newobj.newkey = 
//     }else {
//         newobj[key] = value
//     }
// }
// console.log(newobj)

// // 

//Write a function to generate the Fibonacci sequence up to a given number.

/*
function generateFibo(n) {
    let first = 0;
    let second = 1
    
    console.log(first)
    console.log(second)
    
    let third = 2
    
    while (third < n) {
        third = first + second
        console.log(third)
        first = second
        second = third
    }
}

generateFibo(10)
*/

