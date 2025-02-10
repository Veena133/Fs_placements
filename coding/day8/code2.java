/*Mike set off with great zeal to the "Kracker Jack Fun Fair 2017". 
There were numerous activities in the fair, though Mike being a math expert, 
liked to participate in the Number Challenge.

Mike was given a string D of numbers containing only digits 0's and 1's.
His challenge was to make the number to have all the digits same. For that,
he should change exactly one digit, i.e. from 0 to 1 or from 1 to 0. If it is 
possible to make all digits equal (either all 0's or all 1's) by flipping exactly 1
digit then he has to output "Yes", else print "No" (without quotes).

-Help Mike win over his challenge.

Input Format:
---------------------
First and only input contains a string D of numbers made of only digits 1's and 0's.

Output Format:
----------------------
Output “Yes" or a "No", depending on whether its possible to make it all 0s or 1s or not. 


Sample Testcase:1
----------------------
input=101
output=Yes

Sample Testcase:2
----------------------
input=1100
output=No*/
import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        int c0=0,c1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c1++;
            }
            else{
                c0++;
            }
        }
        if(c0==1 || c1==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

