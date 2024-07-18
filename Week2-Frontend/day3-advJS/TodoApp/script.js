let todos=[]; //array empty by default
//add event
document.getElementById('btn').addEventListener('click',function (){
    const taskInput=document.getElementById('task');
    //todos.push(taskInput.value);
    todos.push({id:Date.now(),task:taskInput.value,completed:false})
    taskInput.value=''; //clean your input field
    console.log('Task Added',todos);
    displayData();
})

function displayData(){
    const taskList=document.getElementById('tasks');
    if(todos.length==0){
        taskList.innerHTML=`<li class='list-group-item'>The list is Empty</li>`
    }else{
        let html=''
        for(let t of todos){
            html+= `<li class='list-group-item' style='text-decoration:${t.completed?'':''}'>${t.task}
            <button class='btn btn-danger float-end' onclick='deleteTask("${t.id}")'>X</button>
            </li>`
        }
        taskList.innerHTML=html;
    }
}
function deleteTask(id){
    console.log(id);
    let foundIndex=undefined;
    for(let i=0;i<todos.length;i++){
        if(todos[i].id==id){
            foundIndex=i;
            console.log("found",i);
            break;
        }
    }
    if(foundIndex!=undefined){
        console.log('started');
        todos.splice(foundIndex,1);
        alert('Task Deleted');
        displayData();
    }
}

displayData();