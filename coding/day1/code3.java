/*
Danny has recently got his job offer as an Event Concept Creator at Sparsh 
Event Services. The Company has sent him a detailed salary structure with
 details of his basic salary, HRA and DA. The Company has promised to pay him as under:
 
If his basic salary is less than Rs. 15000, then HRA = 15% of basic salary 
and DA = 90% of basic salary.
If his basic salary is either equal to or above Rs. 15000, then
 HRA = Rs. 5000 and DA = 98% of basic salary.

If the Danny’s salary is given as input, write a program to 
find his gross salary.
 
Note : Gross Salary = Basic Salary+HRA+DA
 
Input Format:
----------------------
First line of the input is an integer that corresponds to the basic salary of Danny.

Output Format:
----------------------
Output should display the double value that refers to the gross salary of Danny. 
Display the output correct to 2 decimal places.

Note: Refer sample input and output for formatting specifications.

Sample Testcase:1
---------------------
input=12000
output=24600.00

Sample Testcase:2
---------------------
input=30000
output=64400.00*/
import java.util.*;
class Problem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int sal = sc.nextInt();
        double hra,da;
        if(sal<15000){
            hra = sal*0.15;
            da =  sal*0.90;
        }else{
            hra = 5000;
            da = (sal*0.98);
        }
        double gross = sal+hra+da;
        System.out.printf("%.2f",gross);
    }
}
