let balance =5000;
function diposit(amt){
    balance+=amt;
    console.log(`${amt} credited, Avaiilable Bal: ${balance}`);
}
function withdraw(amt){
    if(amt>balance){
        console.log('No sufficient balance available');
    }else{
        balance-=amt;
        console.log(`${amt} debited, Avaiilable Bal: ${balance}`);
    }
}
module.exports={
    diposit,
    withdraw
}
