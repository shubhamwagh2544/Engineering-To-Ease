class Queue {

    constructor() {
        this.data = []
    }

    // enqueue : add element in end
    enqueue(item) {
        this.data.push(item)
    }

    // dequeue : remove element at front
    dequeue() {
        return !this.isEmpty() ? this.data.shift() : null
    }

    // peek : display front element in queue
    peek() {
        return this.isEmpty() ? -1 : this.data[0]
    }

    // isEmpty : check if queue is empty
    isEmpty() {
        return this.data.length === 0 ? true : false
    }

    // size : number of elements in queue
    size() {
        return this.data.length
    }

    // print : print queue
    printQueue() {
        console.log(this.data.toString())
    }
}

const queue = new Queue()
console.log(queue)

console.log(queue.isEmpty())

queue.enqueue(10)
queue.enqueue(20)
queue.enqueue(30)

console.log(queue)

console.log(queue.dequeue())
console.log(queue.dequeue())

console.log(queue)

console.log(queue.peek())