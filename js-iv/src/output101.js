class Person {
    constructor() {
        this.name = 'Lydia';
    }
}

Person = class AnotherPerson {
    constructor() {
        this.name = 'Sarah';
    }
};

const member = new Person();
console.log(member.name);               // Sarah

/*
We can set classes equal to other classes/function constructors. 
In this case, we set Person equal to AnotherPerson. The name on this constructor is Sarah, so the name property on the new Person instance member is "Sarah".
*/

Person = function OneMorePerson() {
    this.name = 'Hell';
}

const member1 = new Person()
console.log(member1.name)               // Hell