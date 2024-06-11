const foo = () => console.log('First');
const bar = () => setTimeout(() => console.log('Second'));
const baz = () => console.log('Third');

bar();
foo();
baz();
// First Third Second

bar();
baz();
foo();
// Third First Second

foo()
baz()
bar()
// First Third Second