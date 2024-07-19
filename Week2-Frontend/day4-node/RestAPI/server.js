const express = require('express');
let array=[];
const app= express();
app.use(express.json());//jsonparser(to read data coming from body)

app.get('/api/user',(req,res)=>{
    res.send(array)
})
app.post('/api/user',(req,res)=>{
    console.log(req.body);
    array.push(req.body);
    res.status(201).send('User Created Successfully')
})
app.get('/api/user/:id',(req,res)=>{
    const id= req.params.id;
    let find= array.find(val=>val.id==id);
    if(find){
        res.send(find)
    }else{
        res.send('User not found')
    }
})
app.delete('/api/user/:id',(req,res)=>{
    const id= req.params.id;
    array= array.filter(val=>val.id!=id);
    res.send('User Deleted')
})
app.put('/api/user/:id',(req,res)=>{
    const id= req.params.id;//id to update
    const index= array.findIndex(val=>val.id==id);
    if(index>=0){
        array[index]=req.body; //update data
        res.send('Data updated')
    }else{
        res.send('user not found to update')
    }
})

app.listen(5000,()=>console.log('Server started'))