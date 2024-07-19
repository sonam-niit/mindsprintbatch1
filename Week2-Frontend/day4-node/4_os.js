const os = require('os');

console.log('System Arch ',os.arch());
console.log('Free Memory ',os.freemem());
console.log('Free Memory ',os.totalmem());
console.log('Home Directory',os.homedir());
console.log('CPU Speed',os.cpus()[0].speed);
console.log('CPU Model Name',os.cpus()[0].model);
const networkInterfaces=os.networkInterfaces();
console.log(networkInterfaces);