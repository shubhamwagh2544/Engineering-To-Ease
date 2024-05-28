function firstNonRepeatingCharacter(str: string): string | undefined {
    const res: { [key: string]: number } = {}
    for (let char of str) {
        res[char] = (res[char] || 0) + 1
    }

    for (let key in res) {
        if (res[key] === 1) {
            return key
        }
    }
}

console.log(firstNonRepeatingCharacter('shubhamwagh'))