function Car() {
    this.make = 'Lamborghini';
    return { make: 'Maserati' };
}

const myCar = new Car();
console.log(myCar.make);                // Maserati

/*
When a constructor function is called with the new keyword, it creates an object and sets the this keyword to refer to that object. By default, if the constructor function doesn't explicitly return anything, it will return the newly created object.

In this case, the constructor function Car explicitly returns a new object with make set to "Maserati", which overrides the default behavior. Therefore, when new Car() is called, the returned object is assigned to myCar, resulting in the output being "Maserati" when myCar.make is accessed.
*/

function Car1() {
    this.make = 'Lamborghini';
}
const myCar1 = new Car1()
console.log(myCar1.make);                // Lamborghini