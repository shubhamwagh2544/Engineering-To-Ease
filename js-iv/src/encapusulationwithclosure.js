var myInstance = (function () {
    var privateVar = '';

    function privateMethod() {
        // ...
    }

    // public interface
    return {
        publicMethod1: function () {
            // All private members are accessible here
        },
        publicMethod2: function () {
        }
    };
})();
