class CircularQueue {

    constructor(capacity) {
        this.data = new Array(capacity)
        this.capacity = capacity
        this.currentLength = 0
        this.front = -1
        this.rear = -1
    }

    isFull() {
        return this.capacity === this.currentLength
    }

    isEmpty() {
        return this.currentLength === 0
    }

    enqueue(item) {
        // check if queue is full
        if (!this.isFull()) {
            this.rear = (this.rear + 1) % this.capacity
            this.data[this.rear] = item
            this.currentLength += 1
            if (this.front === -1) {
                this.front = this.rear
            }
        }
        else {
            console.log('queue full')
        }
    }

    dequeue() {
        // check if queue is empty
        if (this.isEmpty()) {
            return null
        }
        const item = this.data[this.front]
        this.data[this.front] = null
        this.front = (this.front + 1) % this.capacity
        this.currentLength -= 1
        // fresh start if queue is empty
        if (this.isEmpty()) {
            this.front = -1
            this.rear = -1
        }
        return item
    }

    peek() {
        if (this.isEmpty()) {
            return null
        }
        return this.data[this.front]
    }

    printQueue() {
        if (this.isEmpty()) {
            console.log('empty queue')
        }
        else {
            let i
            let str = ''
            for (i = this.front; i !== this.rear; i = (i + 1) % this.capacity) {
                str += this.data[i] + " "
            }
            str += this.data[i]

            console.log(str)
        }
    }

}

const circularQueue = new CircularQueue(5)
console.log(circularQueue.isEmpty())

circularQueue.enqueue(10)
circularQueue.enqueue(20)
circularQueue.enqueue(30)
circularQueue.enqueue(40)
circularQueue.enqueue(50)

circularQueue.printQueue()

circularQueue.enqueue(10)

console.log(circularQueue.dequeue())
console.log(circularQueue.dequeue())

circularQueue.printQueue()

circularQueue.enqueue(60)
circularQueue.enqueue(70)

circularQueue.printQueue()

console.log(circularQueue.peek())
console.log(circularQueue.isFull())
console.log(circularQueue.currentLength)
