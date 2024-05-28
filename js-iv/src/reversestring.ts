function reverseString(str: string) {
    /*let newStr = ''
    for (let i = 0; i < str.length; i++) {
        newStr = str.charAt(i) + newStr
    }
    return newStr*/

    return str.split('').reverse().join('')
}

const str: string = "hello";
console.log(reverseString(str));  // Output: "olleh"