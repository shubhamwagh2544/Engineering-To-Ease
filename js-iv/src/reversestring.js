function reverseString(str) {
    /*let newStr = ''
    for (let i = 0; i < str.length; i++) {
        newStr = str.charAt(i) + newStr
    }
    return newStr*/

    return str.split('').reverse().join('')
}

const string1 = "hello";
console.log(reverseString(string1));  // Output: "olleh"