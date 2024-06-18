const handler = {
    set: () => console.log('Added a new property!'),
    get: () => console.log('Accessed a property!'),
};

const person = new Proxy({}, handler);

person.name = 'Lydia';              // Added a new property!
person.name;                        // Accessed a property!

/*
let proxy = new Proxy(target, handler);
Target: The original object that you want to proxy.
Handler: An object that contains traps, which are functions that intercept operations on the target object.

With a Proxy object, we can add custom behavior to an object that we pass to it as the second argument. In this case, we pass the handler object which contains two properties: set and get. set gets invoked whenever we set property values, and get gets invoked whenever we get (access) property values.

The first argument is an empty object {}, which is the value of person. To this object, the custom behavior specified in the handler object gets added. If we add a property to the person object, set will get invoked. If we access a property on the person object, get gets invoked.

First, we added a new property name to the proxy object (person.name = "Lydia"). set gets invoked, and logs "Added a new property!".

Then, we access a property value on the proxy object, and the get property on the handler object is invoked. "Accessed a property!" gets logged.

use strict / es6 modules => property can be accessed but setting property causes Error.
*/