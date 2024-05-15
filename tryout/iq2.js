// creating a simple http server in nodejs

const http = require('http');

const server = http.createServer((req, res) => {
    res.statusCode = 200
    res.setHeader('Content-Type', 'application/text');
    res.end('Hello World');
})

server.listen(3000, '127.0.0.1' || 'localhost', () => console.log('server started listening!'));