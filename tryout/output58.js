// With which constructor can we successfully extend the Dog class?

class Dog {
    constructor(name) {
        this.name = name;
    }
};

class Labrador extends Dog {
    // 1
    constructor(name, size) {
        this.size = size;
    }
    // 2                                                => works
    constructor(name, size) {
        super(name);
        this.size = size;
    }
    // 3
    constructor(size) {
        super(name);
        this.size = size;
    }
    // 4
    constructor(name, size) {
        this.name = name;
        this.size = size;
    }

};

/*
In a derived class, you cannot access the this keyword before calling super. If you try to do that, it will throw a ReferenceError: 1 and 4 would throw a reference error.

With the super keyword, we call that parent class's constructor with the given arguments. The parent's constructor receives the name argument, so we need to pass name to super.

The Labrador class receives two arguments, name since it extends Dog, and size as an extra property on the Labrador class. They both need to be passed to the constructor function on Labrador, which is done correctly using constructor 2.
*/