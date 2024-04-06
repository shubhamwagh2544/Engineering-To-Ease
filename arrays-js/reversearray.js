function reverseArray(arr) {
    // SC: O(n)
    let reversed = []
    for (let i = arr.length - 1; i >= 0; i--) {
        reversed.push(arr[i]);
    }
    console.log(reversed);

    // SC: O(1)
    let start = 0;
    let end = arr.length - 1;
    while (start < end) {   // O(n/2) => O(n)
        let temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
    console.log(arr);

    // SC: O(1)
    let left = 0;
    let right = arr.length - 1;
    while (left < right) {  // O(n/2) => O(n)
        [arr[left], arr[right]] = [arr[right], arr[left]];      // ES6 destructuring assignment to swap values
        left++;
        right--;
    }
    console.log(arr);

    // SC: O(1)
    for (let i = 0; i < arr.length / 2; i++) {  // O(n/2) => O(n)
        [arr[i], arr[arr.length - 1 - i]] = [arr[arr.length - 1 - i], arr[i]];
    }
    console.log(arr);

    // SC: O(1)
    for (let i = 0; i < arr.length / 2; i++) {  // O(n/2) => O(n)
        let temp = arr[i];
        arr[i] = arr[arr.length - 1 - i];
        arr[arr.length - 1 - i] = temp;
    }
    console.log(arr);

    // SC: O(1)
    for (let i = 0; i < arr.length / 2; i++) {  // O(n/2) => O(n)
        arr[i] = arr[i] + arr[arr.length - 1 - i];      // a = a + b
        arr[arr.length - 1 - i] = arr[i] - arr[arr.length - 1 - i];     // b = a - b
        arr[i] = arr[i] - arr[arr.length - 1 - i];    // a = a - b
    }
    console.log(arr);

    // SC: O(1)
    for (let i = 0; i < arr.length / 2; i++) {  // O(n/2) => O(n)
        arr[i] = arr[i] ^ arr[arr.length - 1 - i];    // a = a ^ b
        arr[arr.length - 1 - i] = arr[i] ^ arr[arr.length - 1 - i];   // b = a ^ b ^ b = a
        arr[i] = arr[i] ^ arr[arr.length - 1 - i];  // a = a ^ b ^ a = b
    }
    console.log(arr);
}

reverseArray([1, 2, 3, 4, 5]); // [5, 4, 3, 2, 1]