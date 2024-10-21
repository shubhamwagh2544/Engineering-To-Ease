const axios = require('axios');

/**
 * Polls a given URL at specified intervals and stops after a maximum timeout.
 *
 * @param {string} url - The URL to poll.
 * @param {number} interval - The interval in milliseconds between each poll.
 * @param {number} maxTimeout - The maximum timeout in milliseconds to stop polling.
 */
function poll(url, interval, maxTimeout) {
    const intervalId = setInterval(async () => {
        try {
            const response = await axios.get(url);
            console.log('Polling response:', response.data);
        } catch (error) {
            console.error('Polling error:', error);
        }
    }, interval);

    setTimeout(() => {
        clearInterval(intervalId);
        console.log('Polling stopped after max timeout');
    }, maxTimeout);
}

// Poll every 5 seconds, stop after 60 seconds
poll('https://api.example.com/data', 5000, 60000);