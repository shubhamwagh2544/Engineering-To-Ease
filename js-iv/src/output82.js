const box = { x: 10, y: 20 };

Object.freeze(box);

const shape = box;
shape.x = 100;

console.log(shape);

/*
The Object.freeze() method is called on box, making it immutable. After this point, no changes can be made to the box object.

The shape variable is assigned the same reference as box. This means shape and box point to the same object in memory.

Since box (and hence shape) is frozen, this attempt to change the x property will fail silently in non-strict mode, meaning the operation is ignored and x remains unchanged. In strict mode, it would throw an error.

Non-Strict Mode: { x: 10, y: 20 }
Strict Mode:     TypeError: Cannot assign to read only property 'x' of object '#<Object>'
*/