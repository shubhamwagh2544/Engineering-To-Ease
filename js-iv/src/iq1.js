/* 
computeAmount().lacs(1).thousands(2).hundreds(3).tens(4).ones(5).value()
*/

function helper() {
    this.totalAmount = 0;
    this.crores = function (val) {
        this.totalAmount += val * 1000000;
        return this;
    }
    this.lacs = function (val) {
        this.totalAmount += val * 100000;
        return this;
    }
    this.thousands = function (val) {
        this.totalAmount += val * 1000;
        return this;
    }
    this.hundreds = function (val) {
        this.totalAmount += val * 100;
        return this;
    }
    this.tens = function (val) {
        this.totalAmount += val * 10;
        return this;
    }
    this.ones = function (val) {
        this.totalAmount += val * 1;
        return this;
    }
    this.value = function () {
        console.log(this.totalAmount)
        return;
    }
}

function computeAmount() {
    return new helper();     // returns single instance
}

computeAmount().lacs(1).thousands(2).hundreds(3).tens(4).ones(5).value();
computeAmount().lacs(15).crores(5).crores(2).lacs(20).thousands(45).crores(7).value();