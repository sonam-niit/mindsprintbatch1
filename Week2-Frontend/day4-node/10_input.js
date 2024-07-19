const fs= require('fs');
// const file= require('readline-sync');

// const name= file.question('Enter your name:');
// console.log('welcome '+name);
//./ means read files from current directory
fs.readdir('./',(err,files)=>{
    if(err){
        console.log(err);
    }else{
        for(let u of files){
            console.log(u);
        }
    }
})