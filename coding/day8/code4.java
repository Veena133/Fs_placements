/*
Sunil is a little scientist. Sunil has planned to design a wildcard
 pattern matcher to exhibit at the "Young Inventors", a tech talent 
show organized at his school.
Sunil wanted to design the wildcard pattern matcher supporting the 
wildcard character '?'. The wildcard character '?' can be substituted
 by any single lower case English letter for matching. He has two strings 
X and Y of equal length, made up of lower case letters and the character '?'.
Sunil wants your help in designing the device, to know whether the strings
 X and Y can be matched or not. Write a program to check whether the given 
strings can be matched or not.
 
Input Format:
-------------------
First line of the input contains the string ‘X’.
Second line of the input contains the string ‘Y’.

Output Format:
--------------------
Output a single line with the word "Yes"(without quotes) if the strings can 
be matched, otherwise output "No"(without quotes).


Sample Testcase:1
-------------------
input=s?or?
sco??
output=Yes

Sample Testcase:2
-------------------
input=stor?
sco??
output=No

*/
import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String s1= sc.nextLine();
        if(s.length()!=s1.length()){
            System.out.println("No");
        }
        else{
        boolean f = true;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != s1.charAt(i) && s.charAt(i) != '?' && s1.charAt(i) != '?') {
                f = false;
                break;
            }
        }
        if(f==true){
        System.out.println("Yes");
        }
        else{
        System.out.println("No");    
        }
        }
    }
}
