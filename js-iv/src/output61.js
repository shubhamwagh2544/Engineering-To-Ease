// fetch todos from given endpoint with id 1 to 10

import axios from "axios"

// 1
async function fetchTodos() {
    const result = [];
    const promises = [];

    for (let id = 1; id <= 10; id++) {
        const promise = fetch(`https://jsonplaceholder.typicode.com/todos/${id}`)
            .then((res) => res.json())
            .then(data => {
                result.push(data);
            });
        promises.push(promise);
    }

    await Promise.all(promises);
    return result;
}

fetchTodos().then(result => console.log(result));

// 2
async function fetchTodos1() {
    const result = []
    for (let id = 1; id <= 10; id++) {
        const res = await axios.get(`https://jsonplaceholder.typicode.com/todos/${id}`)
        result.push(res.data)
    }
    return result
}
const res = await fetchTodos1()
console.log(res)