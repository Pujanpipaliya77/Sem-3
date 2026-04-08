const http = require('http');

const sendResponce = (res,data) => {
    res.end(data);
}

const server = http.createServer((req,res) => {
    switch(req.url){
        case '/':
        sendResponce(res,"<h1> This is home brother </h1>");
        break;

        case '/about':
        sendResponce(res,"<h1> This is for about </h1>");
        break;

        case '/end':
        sendResponce(res,"<h1> This is end </h1>");
        break;

        default:
        sendResponce(res,"<h1>write properly otherwise Go to the hell.</h1>");
        break;
    }
});



server.listen(4000);

