// which of following are falsy

0
new Number(0)
    ('')
    (' ')
new Boolean(false)
undefined


/*
There are 8 falsy values:

1. undefined
2. null
3. NaN
4. false
5. '' (empty string)
6. 0
7. -0
8. 0n (BigInt(0))

Function constructors, like new Number and new Boolean are truthy.
*/


// output of following

!!null;                 // false
!!'';                   // false
!!1;                    // true