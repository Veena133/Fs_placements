/*Write a program to delete all vowels present in a string.

Input Format:
-----------------

Input consists of a string. Assume that all characters in the string 
are lowercase letters and the maximum length of the string is 200.

Output Format:
-----------------
String after deleting all vowels

Sample Testcase:1
---------------------------
input=amphisoft
output=mphsft*/
import java.util.*;
class Solution {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s= sc.next();
        // s=s.toLowerCase();
        String str1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                // s=s.replace(s.charAt(i),' ');
                continue;
            }
            else{
                str1=str1+s.charAt(i);
            }
        }
        System.out.println(str1);
    }
}
//String b=s.replaceAll(“[aeiouAEIOU]”,”“);//regularExpressions.
