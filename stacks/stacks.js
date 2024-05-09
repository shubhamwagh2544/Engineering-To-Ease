class Stack {

    constructor() {
        this.data = []
    }

    // push : add on top
    push(item) {
        this.data.push(item)
    }

    // pop : remove from top
    pop() {
        return this.isEmpty() ? null : this.data.pop()
    }

    // size : number of elements in stack
    size() {
        return this.data.length
    }

    // peek : display top element
    peek() {
        return !this.isEmpty() ? this.data[this.data.length - 1] : -1
    }

    // isEmpty :  if stack is empty
    isEmpty() {
        return this.data.length === 0 ? true : false
    }

    // clear : remove all data
    clear() {
        this.data = []
    }

    printStack() {
        let str = ""
        for (let i = 0; i < this.data.length; i++) {
            str += this.data[i] + " "
        }
        return str
    }
}

const stack = new Stack();
stack.push(10);
stack.push(20);
stack.push(30);

console.log("Stack elements:", stack.printStack()); // Output: 10 20 30
console.log("Stack size:", stack.size()); // Output: 3
console.log("Top element:", stack.peek()); // Output: 30
console.log("Popped element:", stack.pop()); // Output: 30
console.log("Stack elements after popping:", stack.printStack()); // Output: 10 20