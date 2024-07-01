class Counter {
    constructor() {
        this.count = 0;
    }

    increment() {
        this.count++;
    }
}

const counterOne = new Counter();
counterOne.increment();                         // 1
counterOne.increment();                         // 2

const counterTwo = counterOne;
counterTwo.increment();                         // 3

console.log(counterOne.count);

const counterThree = new Counter()
counterThree.increment()                        // 1
counterThree.increment()                        // 2

console.log(counterThree.count)

/*
counterOne is an instance of the Counter class. The counter class contains a count property on its constructor, and an increment method. First, we invoked the increment method twice by calling counterOne.increment(). Currently, counterOne.count is 2.

Then, we create a new variable counterTwo, and set it equal to counterOne. Since objects interact by reference, we're just creating a new reference to the same spot in memory that counterOne points to. Since it has the same spot in memory, any changes made to the object that counterTwo has a reference to, also apply to counterOne. Currently, counterTwo.count is 2.

We invoke counterTwo.increment(), which sets count to 3. Then, we log the count on counterOne, which logs 3.
*/