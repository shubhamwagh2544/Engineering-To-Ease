console.log(`${(x => x)('I love')} to program`);            // I love to program

/*
Expressions within template literals are evaluated first. This means that the string will contain the returned value of the expression, the immediately invoked function (x => x)('I love') in this case. We pass the value 'I love' as an argument to the x => x arrow function. x is equal to 'I love', which gets returned. This results in I love to program.
*/

const groceries = ['banana', 'apple', 'peanuts'];

if (groceries.indexOf('banana')) {
    console.log('We have to buy bananas!');
} else {
    console.log(`We don't have to buy bananas!`);
}

// We don't have to buy bananas!

/*
We passed the condition groceries.indexOf("banana") to the if-statement. 
groceries.indexOf("banana") returns 0, which is a falsy value. Since the condition in the if-statement is falsy, the code in the else block runs, and We don't have to buy bananas! gets logged.
*/