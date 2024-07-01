console.log(Number(""))         // 0
console.log(parseInt(""))       // NaN

console.log(Number("7*3"))      // NaN
console.log(parseInt("7*3"))    // 7

/*
Number() :=> Can convert any type of value (string, boolean, etc.) to a number. If the value cannot be converted to a number, it returns NaN.
Number('');           // 0
Number(true);         // 1
Number(false);        // 0
Number(null);         // 0
Number(undefined);    // NaN

parseInt() :=> Primarily used to parse a string and extract an integer from it. It stops parsing at the first non-numeric character. By default, it assumes the base (radix) is 10, but you can specify a different base.
parseInt('123.45');    // 123
parseInt('123abc');    // 123
parseInt('abc123');    // NaN
parseInt('');          // NaN
parseInt('   123');    // 123
*/