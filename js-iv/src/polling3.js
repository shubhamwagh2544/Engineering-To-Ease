const apiEndpoint = 'https://example.com/api/endpoint'; // API endpoint
const successResponse = 'success'; // success response

const pollingInterval = 5000; // 5 seconds in milliseconds
const maxPollingDuration = 300000; // 300 seconds (5 minutes) in milliseconds

/**
 * Polls the given API endpoint at regular intervals until a success response is received
 * or the maximum polling duration is reached.
 *
 * @param {string} apiEndpoint - The API endpoint to poll.
 * @param {string} successResponse - The expected success response from the API.
 * @param {number} pollingInterval - The interval between each poll in milliseconds.
 * @param {number} maxPollingDuration - The maximum duration to poll in milliseconds.
 * @returns {Promise<void>}
 */
async function pollApi(apiEndpoint, successResponse, pollingInterval, maxPollingDuration) {
    const startTime = Date.now(); // Record the start time

    const makeRequest = async () => {
        try {
            const response = await fetch(apiEndpoint); // Make request
            const data = await response.json();

            if (data.status === successResponse) {
                console.log('Success response received:', data);
                return; // Stop polling if success response
            }

            const elapsedTime = Date.now() - startTime;

            if (elapsedTime < maxPollingDuration) {
                setTimeout(makeRequest, pollingInterval); // Schedule next request
            } else {
                console.log('Maximum polling duration reached. Stopping polling.');
            }
        } catch (error) {
            console.error('Error making API request:', error);
            const elapsedTime = Date.now() - startTime;

            if (elapsedTime < maxPollingDuration) {
                setTimeout(makeRequest, pollingInterval); // Schedule next request
            } else {
                console.log('Maximum polling duration reached. Stopping polling.');
            }
        }
    };

    await makeRequest(); // Start the first request
}

// Start polling the API
pollApi(apiEndpoint, successResponse, pollingInterval, maxPollingDuration);