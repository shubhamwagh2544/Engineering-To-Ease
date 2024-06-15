const add = x => x + x

function call(num = 2, value = add(num)) {
    console.log(num, value)
}

call()                  // 2 4
call(3)                 // 3 6