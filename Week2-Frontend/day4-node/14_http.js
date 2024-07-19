const http = require('http');
const fs = require('fs');
const products = require('./products.json');
const server = http.createServer((req, res) => {

    if (req.url == '/products') {
        res.write(JSON.stringify(products));
        res.end();
    } else if (req.url == '/products/1') {
        const product = products.find(p => p.id == 1);
        res.write(JSON.stringify(product));
        res.end();
    } else if (req.url == '/about') {
        fs.readFile('./files/about.html', (err, data) => {
            if (err)
                console.log(err);
            else {
                res.write(data.toString());
                res.end();
            }
        })
    }
    else {
        res.write('<h1>Hello From Server</h1>');
        res.end();
    }

})

//start the server
server.listen(5000, () => console.log('Server started'));