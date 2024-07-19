const fs= require('fs');

console.log('Reading file Started');
fs.readFile('./files/data.txt',(err,data)=>{
    if(err){
        console.log(err);
    }else{
        console.log(data.toString());
        //by default data comes in buffer
        //so convert into string to read the correct data
    }
})

console.log('Reading file stopped');