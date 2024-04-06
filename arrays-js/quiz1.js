function swap(a, b) {
    let temp = a
    a = b
    b = temp
}

function main() {
    a = 10
    b = 20
    console.log(a, b)
    
    swap(a, b)
    
    console.log(a, b)
}

main()