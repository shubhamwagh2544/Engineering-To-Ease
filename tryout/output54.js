const settings = {
    username: 'lydiahallie',
    level: 19,
    health: 90,
};

const data = JSON.stringify(settings, ['level', 'health']);

console.log(data);                  // "{"level":19,"health":90}"

/*
The second argument of JSON.stringify is the replacer. The replacer can either be a function or an array, and lets you control what and how the values should be stringified.

If the replacer is an array, only the property names included in the array will be added to the JSON string. In this case, only the properties with the names "level" and "health" are included, "username" is excluded. data is now equal to "{"level":19, "health":90}".

If the replacer is a function, this function gets called on every property in the object you're stringifying. The value returned from this function will be the value of the property when it's added to the JSON string. If the value is undefined, this property is excluded from the JSON string.
*/

const obj = {
    firstname: 'sh',
    lastname: 'wa'
}
const jsondata = JSON.stringify(obj, function (key, val) {
    // if (key === 'firstname') {
    //     return 'shubham'
    // }
    // else if (key === 'lastname') {
    //     return 'wagh'
    // }
    // else {
    //     return val
    // }
    if (typeof val === 'string') {
        return val + 'xyz'
    }
    else {
        return val
    }
})

console.log(jsondata)