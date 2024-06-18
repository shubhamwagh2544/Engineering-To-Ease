console.log(Number(2) === Number(2));                   // true

console.log(Boolean(false) === Boolean(false));         // true

console.log(Symbol('foo') === Symbol('foo'));           // ƒalse

/*
Every Symbol is entirely unique. The purpose of the argument passed to the Symbol is to give the Symbol a description. The value of the Symbol is not dependent on the passed argument. As we test equality, we are creating two entirely new symbols: the first Symbol('foo'), and the second Symbol('foo'). These two values are unique and not equal to each other, Symbol('foo') === Symbol('foo') returns false.
*/