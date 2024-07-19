const fs= require('fs');

console.log('Sync operations started');
fs.writeFileSync('./files/test.txt','Hello from MindSprint. ');
console.log('Data Written successfully');
fs.appendFileSync('./files/test.txt','New Message. ');
console.log('Data appended successfully');
const data=fs.readFileSync('./files/test.txt');
console.log('Reading completed', data.toString());
fs.unlinkSync('./files/test.txt');
console.log('file deleted successfully');
console.log('Sync operations completed');