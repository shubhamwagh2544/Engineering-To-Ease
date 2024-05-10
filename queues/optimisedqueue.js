class Queue {

    constructor() {
        this.data = {}
        this.front = 0
        this.rear = 0
    }

    // enqueue
    enqueue(item) {                             // O(1)
        this.data[this.rear] = item
        this.rear++
    }

    // dequeue
    dequeue() {                                 // O(1)
        const item = this.data[this.front]
        delete this.data[this.front]
        this.front++
        return item
    }

    // isEmpty
    isEmpty() {
        return this.rear - this.front === 0
    }

    // peek
    peek() {
        return this.data[this.front]
    }

    // size
    size() {
        return this.rear - this.front
    }

    // print
    printQueue() {
        console.log(this.data)
    }
}

const queue = new Queue()
console.log(queue)
console.log(queue.isEmpty())

queue.enqueue(10)
queue.enqueue(20)
queue.enqueue(30)

queue.printQueue()

console.log(queue.dequeue())
console.log(queue.peek())

console.log(queue.size())
