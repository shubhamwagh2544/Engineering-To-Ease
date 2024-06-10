// How long is cool_secret accessible?

sessionStorage.setItem('cool_secret', 123);

/*
The data stored in sessionStorage is removed after closing the tab.
If you used localStorage, the data would've been there forever, unless for example localStorage.clear() is invoked.
*/