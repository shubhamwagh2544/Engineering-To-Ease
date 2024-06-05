/*
Given a string array words, return an array of all characters that show up in all strings within the words (including duplicates). You may return the answer in any order.
Input: words = ["bella","label","roller"]
Output: ["e","l","l"]
*/

function countFrequency(word: string) {
    const frequency: number[] = Array(26).fill(0)
    for (let char of word) {
        frequency[char.charCodeAt(0) - 'a'.charCodeAt(0)]++
    }
    return frequency
}

function findIntersection(freq1: number[], freq2: number[]): number[] {
    return freq1.map((val, index) => Math.min(val, freq2[index]))
}

function commonChars(words: string[]): string[] {
    // frequency array
    let frequency = countFrequency(words[0])
    for (let i = 0; i < words.length; i++) {
        frequency = findIntersection(frequency, countFrequency(words[i]))
    }
    // chars in frequency array as result
    const res: string[] = []
    for (let i = 0; i < frequency.length; i++) {
        while (frequency[i] > 0) {
            res.push(String.fromCharCode(i + 'a'.charCodeAt(0)))
            frequency[i]--
        }
    }
    return res
}

console.log(
    commonChars(["bella", "label", "roller"])
)