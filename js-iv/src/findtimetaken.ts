import { measure } from "helpful-decorators"

class FindTimeTaken {
    constructor() { }

    @measure                                        // 6.46 milliseconds.
    reverseStringInPlace(s: string[]): void {
        for (let i = 0; i < s.length / 2; i++) {
            let temp = s[i]
            s[i] = s[s.length - i - 1]
            s[s.length - i - 1] = temp
        }
        console.log(s)
    }

    @measure                                        // 0.09 milliseconds.
    reverseStringInPlace2(s: string[]): void {
        let left = 0
        let right = s.length - 1

        while (left < right) {
            const temp = s[left]
            s[left] = s[right]
            s[right] = temp
            left++
            right--
        }

        console.log(s)
    }
}

const obj = new FindTimeTaken()
obj.reverseStringInPlace(["h", "e", "l", "l", "o"])
obj.reverseStringInPlace2(["h", "e", "l", "l", "o"])