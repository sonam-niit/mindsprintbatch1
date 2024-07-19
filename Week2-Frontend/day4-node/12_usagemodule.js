const { diposit, withdraw } = require("./11_accountmodule");
const check = require("./13_export");
diposit(4500);
withdraw(4000);

console.log(check(45));