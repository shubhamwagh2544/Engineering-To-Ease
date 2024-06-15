const obj = {
    "1": "a",
    1: "b",
    [1]: "c"
}

console.log(obj["1"])           // c

/*
In JavaScript, object keys are always converted to strings unless they are symbols. When you define an object key using a number or a string, it gets converted to a string.
"1": "a" => The key is the string "1".

1: "b" => The key is the number 1, but it gets converted to the string "1".

[1]: "c" => The key is computed as the number 1, which also gets converted to the string "1".

Therefore, all three keys ("1", 1, and [1]) are considered the same key, "1".
Hence object becomes: obj = { "1": "c" }
*/