const express = require('express');
const app= express(); //server created

//create APIs
app.get('/',(req,res)=>{
    res.status(200).send('Hello From Express Server')
})
app.get('/about',(req,res)=>{
    res.status(200).sendFile(__dirname+'/files/about.html')
})
app.get('/news',(req,res)=>{
    res.status(200).send({message:'Hello',
        news:'systems are not working'})
})

app.listen(5000,()=>console.log('server started'))