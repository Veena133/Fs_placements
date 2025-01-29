/*
You are working on a data processing application for a retail company. 
The application processes product codes, which are alphanumeric strings 
containing both numbers and alphabets.

-Your task is to calculate the sum of all numerical values present in these
 product codes.

Sample Testcase:1
-------------------------------
input
hello1234
output
10

Sample Testcase:2
-------------------------------
input
n8g9i7t5
output
29
*/
import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum=0;
        for( int i=0;i<s.length();i++){
            char c= s.charAt(i);
            String s1= "";
            s1=s1+c;
            if(Character.isDigit(c)){
                sum += Integer.parseInt(s1);
                // sum+=Character.getNumericValue(c); 
                /*
                if(str.charAt(i)-'0'>=1 && str.charAt(i)='0'<=9)
                {
                    sum+=str.charAt(i)-'0';
                }
       }
        }
        */
        System.out.println(sum);
    }
}
