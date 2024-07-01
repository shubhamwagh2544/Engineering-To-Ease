const output = `${[] && 'Im'}possible!

You should${'' && `n't`} see a therapist after so much JavaScript lol`;

/*
Output: Impossible! You should see a therapist after so much JavaScript lol

[] is a truthy value. With the && operator, the right-hand value will be returned if the left-hand value is a truthy value. In this case, the left-hand value [] is a truthy value, so "Im' gets returned.

"" is a falsy value. If the left-hand value is falsy, nothing gets returned. n't doesn't get returned.
*/