const fs= require('fs');

fs.appendFile('./files/data.txt','Hello from New User. ',(err)=>{
    if(err){
        console.log(err);
    }else{
        console.log('Data appended successfully..');
    }
})
//append file appends data at the end of the file.
//if file not exist then it will create new file
fs.readFile('./files/data.txt',(err,data)=>{
    if(err){
        console.log(err);
    }else{
        console.log(data.toString());
        //by default data comes in buffer
        //so convert into string to read the correct data
    }
})