// What does this method do?

// JSON.parse();

/*
With the JSON.parse() method, we can parse JSON string to a JavaScript value.
*/


// Stringifying a number into valid JSON, then parsing the JSON string to a JavaScript value:
const jsonNumber = JSON.stringify(4); // '4'
JSON.parse(jsonNumber); // 4

// Stringifying an array value into valid JSON, then parsing the JSON string to a JavaScript value:
const jsonArray1 = JSON.stringify([1, 2, 3]); // '[1, 2, 3]'
JSON.parse(jsonArray1); // [1, 2, 3]

// Stringifying an object  into valid JSON, then parsing the JSON string to a JavaScript value:
const jsonArray2 = JSON.stringify({ name: 'Lydia' }); // '{"name":"Lydia"}'
JSON.parse(jsonArray2); // { name: 'Lydia' }


// SyntaxError: undefined (Unexpected token u in JSON at position 0)
const data = JSON.parse()