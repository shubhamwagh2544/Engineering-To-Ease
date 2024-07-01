const obj = { a: 'one', b: 'two', a: 'three' };

console.log(obj);           // { a: 'three', b: 'two' }


/*
If you have two keys with the same name, the key will be replaced. 
It will still be in its first position, but with the last specified value.
*/