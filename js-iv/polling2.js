const express = require('express');
const axios = require("axios");
const app = express();

app.get('/polling', (req, res) => {
    res.status(200).send('Hello World');
});

app.listen(3000, '127.0.0.1', () => {
    console.log('Server is running on port 3000');
});

const maxPolling = 5 * 60 * 1000; // 5 minutes
async function pollingApi() {
    const start = Date.now();
    try {
    const response = await axios.get('http://localhost:3000/polling');
        if (response.status === 200) {
            console.log(response.data);
        return;
    }
    } catch (error) {
        console.error('Error fetching data:', error);
    }

    const remainingTime = Date.now() - start;
    if (remainingTime > maxPolling) {
        console.log('Time out');
        return;
    }

    // Add a delay before retrying
    setTimeout(pollingApi, 1000);
}

pollingApi();