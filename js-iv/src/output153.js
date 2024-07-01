function getFruit(fruits) {
    console.log(fruits?.[1]?.[1])
}

getFruit([['🍊', '🍌'], ['🍍']])                    // undefined
getFruit()                                         // undefined
getFruit([['🍍'], ['🍊', '🍌']])                    // 🍌

/*
The ? allows us to optionally access deeper nested properties within objects. We're trying to log the item on index 1 within the subarray that's on index 1 of the fruits array. If the subarray on index 1 in the fruits array doesn't exist, it'll simply return undefined. If the subarray on index 1 in the fruits array exists, but this subarray doesn't have an item on its 1 index, it'll also return undefined.

First, we're trying to log the second item in the ['🍍'] subarray of [['🍊', '🍌'], ['🍍']]. This subarray only contains one item, which means there is no item on index 1, and returns undefined.

Then, we're invoking the getFruits function without passing a value as an argument, which means that fruits has a value of undefined by default. Since we're conditionally chaining the item on index 1 offruits, it returns undefined since this item on index 1 does not exist.

Lastly, we're trying to log the second item in the ['🍊', '🍌'] subarray of ['🍍'], ['🍊', '🍌']. The item on index 1 within this subarray is 🍌, which gets logged.
*/