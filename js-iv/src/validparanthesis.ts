function isValid(str: string): boolean {
    // stack
    const stack: string[] = []
    const map: { [key: string]: string } = {
        '(': ')',
        '[': ']',
        '{': '}'
    }
    for (let char of str) {
        if (map[char]) {
            stack.push(map[char])
        }
        else if (stack.length > 0 && stack[stack.length - 1] === char) {
            stack.pop()
        }
        else {
            return false
        }
    }

    return stack.length === 0
}

const string1 = "()[]{}";
console.log(isValid(string1));  // Output: true