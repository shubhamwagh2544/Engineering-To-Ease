function getPersonInfo(one, two, three, four) {
    console.log('one:', one);
    console.log('two:', two);
    console.log('three:', three);

    console.log('four', four)                       // undefined
}

const person = 'Lydia';
const age = 21;

getPersonInfo`${person} is ${age} years old`;


/*
If you use tagged template literals, the value of the first argument is always an array of the string values. The remaining arguments get the values of the passed expressions!
*/