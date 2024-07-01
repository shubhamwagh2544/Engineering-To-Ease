const myPromise = Promise.resolve('Woah some cool data');

(async () => {
    try {
        console.log(await myPromise);
    } catch {
        throw new Error(`Oops didn't work`);
    } finally {
        console.log('Oh finally!');
    }
})();

/*
Output: 
    Woah some cool data
    Oh finally!

In the try block, we're logging the awaited value of the myPromise variable: "Woah some cool data". Since no errors were thrown in the try block, the code in the catch block doesn't run. The code in the finally block always runs, "Oh finally!" gets logged.
*/