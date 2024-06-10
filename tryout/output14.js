function sum(a, b) {
    return a + b;
}

console.log(sum(1, '2'))        // 12 (string)


/*
JavaScript is a dynamically typed language: It allows implicit type coercion i.e. automatic conversion of one data type into another without us knowing.
During the addition of a numeric type (1) and a string type ('2'), the number is treated as a string. And it is concatenated as '12'
*/