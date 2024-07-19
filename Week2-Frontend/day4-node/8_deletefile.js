const fs= require('fs');

if(fs.existsSync('./files/data.txt')){

    fs.unlink('./files/data.txt',(err)=>{
        if(err){
            console.log(err);
        }else{
            console.log('file deleted successfully');
        }
    })
}else{
    console.log('No file available to delete');
}
fs.mkdir('./hello',(err)=>{
    if(err){
        console.log(err);
    }else{
        console.log('directory created successfully');
    }
})
