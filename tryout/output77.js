const name = 'Lydia Hallie';

console.log(name.padStart(13));

console.log(name.padStart(2));

/*
With the padStart method, we can add padding to the beginning of a string. The value passed to this method is the total length of the string together with the padding. The string "Lydia Hallie" has a length of 12. name.padStart(13) inserts 1 space at the start of the string, because 12 + 1 is 13.

If the argument passed to the padStart method is smaller than the length of the array, no padding will be added.
*/

console.log(String.raw`Hello\nworld`);          // Hello\nworld

/*
String.raw returns a string where the escapes (\n, \v, \t etc.) are ignored!
*/