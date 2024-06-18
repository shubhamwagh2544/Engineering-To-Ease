let count = 0;
const nums = [0, 1, 2, 3];

nums.forEach(num => {
    if (num) count += 1
})

console.log(count)              // 3

/*
The if condition within the forEach loop checks whether the value of num is truthy or falsy. Since the first number in the nums array is 0, a falsy value, the if statement's code block won't be executed. 

count only gets incremented for the other 3 numbers in the nums array, 1, 2 and 3. Since count gets incremented by 1 3 times, the value of count is 3.
*/