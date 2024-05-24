function longestCommonPrefix(str) {
    str.sort()
    let i = 0
    let length = str[0].length
    while (i < length && str[0].charAt(i) === str[str.length - 1].charAt(i)) {
        i++;
    }
    return str[0].substring(0, i)
}

const strings1 = ["flower", "flow", "flight"];
console.log(longestCommonPrefix(strings1));  // Output: "fl"