function reversePartOfArray(arr, start, end) {
    if (start === end) {
        // do nothing
        console.log(arr);
        return;
    }
    let left = start;
    let right = end;
    while (left < right) {
        [arr[left], arr[right]] = [arr[right], arr[left]];
        left++;
        right--;
    }
    console.log(arr);

    // SC: O(1)
    // TC: O(n/2) => O(n)
    for (let i = start; i < (start + end) / 2; i++) {
        [arr[i], arr[start + end - i]] = [arr[start + end - i], arr[i]];
    }
    console.log(arr);

    // SC: O(1)
    // TC: O(n/2) => O(n)
    for (let i = start; i < (start + end) / 2; i++) {
        let temp = arr[i];
        arr[i] = arr[start + end - i];
        arr[start + end - i] = temp;
    }
    console.log(arr);

    // SC: O(1)
    // TC: O(n/2) => O(n)
    for (let i = start; i < (start + end) / 2; i++) {
        arr[i] = arr[i] + arr[start + end - i];
        arr[start + end - i] = arr[i] - arr[start + end - i];
        arr[i] = arr[i] - arr[start + end - i];
    }
    console.log(arr);

    // SC: O(1)
    // TC: O(n/2) => O(n)
    for (let i = start; i < (start + end) / 2; i++) {
        arr[i] = arr[i] ^ arr[start + end - i];
        arr[start + end - i] = arr[i] ^ arr[start + end - i];
        arr[i] = arr[i] ^ arr[start + end - i];
    }
    console.log(arr);
}
reversePartOfArray([1, 2, 3, 4, 5, 6, 7, 8, 9], 2, 5);      // [1, 2, 6, 5, 4, 3, 7, 8, 9]