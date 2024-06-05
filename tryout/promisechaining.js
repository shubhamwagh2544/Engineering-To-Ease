function chain1() {
    return new Promise((res, rej) => {
        setTimeout(() => {
            const data = 'resolved 1'
            res(data)
        }, 1000)
    })
}
function chain2() {
    return new Promise((res, rej) => {
        setTimeout(() => {
            const data = 'resolved 2'
            res(data)
        }, 1000)
    })
}
function chain3() {
    return new Promise((res, rej) => {
        setTimeout(() => {
            const data = 'resolved 3'
            res(data)
        }, 1000)
    })
}

chain1()
    .then((data) => {
        console.log(data)
        return chain2()
    })
    .then((data) => {
        console.log(data)
        return chain3()
    })
    .then((data) => {
        console.log(data)
    })
    .catch((err) => {
        console.log('error', err)
    })
    .finally(() => {
        console.log('resources closed')
    })