const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout,
});
//num.toString().split(‘’).map(Number)
function sumOfCubes(num) {
    let sum=0;
 while(num>0){
    let a= num%10;
    sum=sum+(a*a*a);
    num=Math.floor(num/10);
/*
Math.pow(n,3);
*/
 }
 return sum;
}
readline.question('',function(input){
    const number = parseInt(input);
    const result = sumOfCubes(number);
    console.log(result);

readline.close();
});*/
