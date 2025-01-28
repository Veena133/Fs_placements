/*Given an integer x, return true if x is a palindrome, and false otherwise.

Sample Testcase:1
----------------------------
input=121
output=true

Explanation: 
--------------
121 reads as 121 from left to right and from right to left.
*/

let readline=require('readline').createInterface({input:process.stdin,output:process.stdout});
let x;
readline.question('',function(line){
    x=parseInt(line);
    isPalindrome(x);
    readline.close();
});

function isPalindrome(n){
    let str = n.toString()
    let rev=str.split('').reverse().join('')
    console.log(str===rev)
}

/*
While(n>0){
Let a= n%10;
Res=Res*10+a;
N=Math.floor(n/10)

*/
