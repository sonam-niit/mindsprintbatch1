const fs=require('fs');

const message='Test from my another file'
fs.writeFile('./files/hello.txt',message,(err)=>{
    if(err){
        console.log(err);
    }else{
        console.log('Data Written successfully');
    }
})
//create file if its not exist
//open the file if its exist
//write the data to the file
//if there is some data already available to the file then it will delete
//old data and add new data (overwrite) to the file