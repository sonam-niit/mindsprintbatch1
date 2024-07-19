export function login(uname,pass){
    if(uname=='admin' && pass=='admin123')
        console.log('Logged in');
    else
        console.log('Invalid crednetials');
}
export let fullName="Sonam Soni";
//create register, login, updatePassword and logout as functions using array
//export all and use it to some other file by importing