const emojis = ['🎄', '🎅🏼', '🎁', '⭐'];

// Which of the options result(s) in an error?
/* 1 */ emojis.push('🦌');
/* 2 */ emojis.splice(0, 2);
/* 3 */ emojis = [...emojis, '🥂'];
/* 4 */ emojis.length = 0;                      // Error

/*
The const keyword simply means we cannot redeclare the value of that variable, it's read-only. However, the value itself isn't immutable. The properties on the emojis array can be modified, for example by pushing new values, splicing them, or setting the length of the array to 0.
*/


// how to delete elements in the array
let arr = [1, 2, 4]
arr.length = 0
console.log(arr)