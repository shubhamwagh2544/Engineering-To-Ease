// what is output of following code ?

Promise.resolve().then(() => console.log(1));

queueMicrotask(() => console.log(2));

setTimeout(() => console.log(3), 0);

console.log(4);

new Promise(() => console.log(5));

(async () => console.log(6))();

// 4 5 6 1 2 3

/*
Here, the execution of diff types of async operations (microtask and macrotask) happens in diff order.

Synchronous Code Execution: 
1. console.log(4);
2. new Promise(() => console.log(5));
3. (async () => console.log(6))();

MicroTask Code Execution: 
4. Promise.resolve().then(() => console.log(1));
5. queueMicrotask(() => console.log(2));

MacroTask Code Execution: 
6. setTimeout(() => console.log(3), 0);
*/