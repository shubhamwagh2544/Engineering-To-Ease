class Chameleon {
    static colorChange(newColor) {
        this.newColor = newColor;
        return this.newColor;
    }

    constructor({ newColor = 'green' } = {}) {
        this.newColor = newColor;
    }
}

const freddie = new Chameleon({ newColor: 'purple' });
console.log(freddie.colorChange('orange'));                     // if not static, then 'orange'

/*
Since freddie is an instance of class Chameleon, the function cannot be called upon it. A TypeError is thrown.
*/