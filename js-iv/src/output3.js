const shape = {
    radius: 10,
    diameter() {
        return this.radius * 2;
    },
    perimeter: () => 2 * Math.PI * this.radius,         // 2 * Math.PI * undefined => NaN
};

console.log(shape.diameter());
console.log(shape.perimeter());

/*
diameter is regular function: 'this' in diameter refers to shape object
perimeter is arrow function: it does not have 'this' of own. it refers to parent scope 'this' which is 'global' in nodejs and 'window' in browser
*/