const config = {
    languages: [],
    set language(lang) {
        return this.languages.push(lang);
    },
    get getLanguages() {
        return this.languages
    }
};

console.log(config.language);               // undefined
console.log(config.languages);              // []
console.log(config.language());             // TypeError: config.language is not a function
console.log(config.getLanguages)            // []

/*
The language method is a setter. Setters don't hold an actual value, their purpose is to modify properties. When calling a setter method, undefined gets returned.
*/