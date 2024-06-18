class Counter {
    #number = 10

    increment() {
        this.#number++
    }

    getNum() {
        return this.#number
    }
}

const counter = new Counter()
counter.increment()

console.log(counter.#number)    // SyntaxError: Private field '#number' must be declared in an enclosing class

/*
In ES2020, we can add private variables in classes by using the #. We cannot access these variables outside of the class. 
When we try to log counter.#number, a SyntaxError gets thrown: we cannot access it outside the Counter class!
*/

console.log(counter.getNum())           // 11