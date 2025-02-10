/*
As a young jedi you must learn to converse with Yoda.
 You have found a simple rule that helps change a “normal” sentence
 into “Yoda talk”. Take the first two words in the sentence and place 
them at the end. Write a program that uses this rule to change normal 
sentence into “Yoda talk”.


Input Format:
-------------------
Input consists of a string that you must change into “Yoda talk”.
Assume that the maximum length of the string is 100;

Output Format:
--------------------
Print the corresponding sentence in Yoda talk.

Sample Testcase:1
-------------------------
input=I will go now to find the Wookiee
output=go now to find the Wookiee I will
*/
import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a[]= sc.nextLine().split(" ");
        if(a.length>2){
            String s=a[0];
            String s1=a[1];
            StringBuilder str = new StringBuilder();
            for(int i=2;i<a.length;i++){
                str.append(a[i]+" ");
            }
            str.append(s+" ");
            str.append(s1);
            System.out.println(str.toString());
        }
        else{
            System.out.println(Arrays.toString(a));
        }
    }
}
/*int w1=s.indexOf(“ “);
int w2 = s.indexOf(“ “,w1+1);
if(w1==-1||w2==-1){
Sout(s)
}
Else{
Sout(s.substring(w2+1)+” “+s.substring(0,w2);
*/
