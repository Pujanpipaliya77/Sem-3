// const http = require('http');

// const server = http.createServer((req,res) => {
//     res.end("hello from nodejs!!");
// }
// );

// server.listen(8000);

const fs= require('fs');

let data = fs.readFileSync('demo.txt');
consol.log(data);
