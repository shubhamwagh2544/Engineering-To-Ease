// 1
function Animal(name) {
    this.name = name;
}

Animal.prototype.speak = function () {
    console.log(`${this.name} makes a sound`);
};

function Dog(name) {
    Animal.call(this, name);
}

Dog.prototype = Object.create(Animal.prototype);
Dog.prototype.constructor = Dog;

Dog.prototype.speak = function () {
    console.log(`${this.name} barks`);
};

const animal = new Animal('Animal');
const dog = new Dog('Rex');

animal.speak(); // "Animal makes a sound"
dog.speak();    // "Rex barks"


// 2
class A {
    greet() {
        console.log('A greet')
    }
}
class B extends A {
    greet() {
        console.log('B greet')
    }
}
const AObj = new A()
AObj.greet()    // A greet
const BObj = new B()
BObj.greet()    // B greet 