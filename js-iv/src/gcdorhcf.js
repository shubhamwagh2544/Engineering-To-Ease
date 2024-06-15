// 1
function gcd(n1, n2) {
    let res = 1;
    for (let i = 2; i <= Math.min(n1, n2); i++) {
        if (n1 % i === 0 && n2 % i === 0) {
            res = Math.max(res, i)
        }
    }
    return res
}
console.log(gcd(24, 36))                // TC: O(min(n1, n2))

// 2
function gcd1(n1, n2) {
    for (let i = Math.min(n1, n2); i > 0; i--) {
        if (n1 % i === 0 && n2 % i === 0) {
            return i
        }
    }
}
console.log(gcd1(24, 36))               // TC: O(min(n1, n2)) (but smaller iterations)

// 3
/*
Euclidean Algorithm: GCD of two numbers remains the same even if the smaller number is subtracted from the larger number
*/
function gcd2(n1, n2) {
    while (n1 > 0 && n2 > 0) {
        if (n1 > n2) {
            n1 = n1 - n2
        }
        else if (n1 === n2) {
            return n2
        }
        else {
            n2 = n2 - n1
        }
    }
    if (n1 === 0) {
        return n2
    }
}
console.log(gcd2(24, 36))               // TC: O(min(n1, n2))

// 4
function gcd3(n1, n2) {
    while (n1 > 0 && n2 > 0) {
        if (n1 > n2) {
            n1 = n1 % n2
        }
        else {
            n2 = n2 % n1
        }
    }
    if (n1 === 0) {
        return n2
    }
}
console.log(gcd3(24, 36))               // TC: O(min(n1, n2))