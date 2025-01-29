
/*In the gifts store, Sita finds a lot of fancy articles with letters 
inscribed in it. She decides to select gifts to her friends such that 
the first letter of their names are inscribed in the gift articles.
 
There is a hifi-scanner  device in the gifts shop that would illumninate 
the articles that contain the letters fed as input. There is another 
interfacing device that would pick the 1st letters of all names entered 
by the user.
 
Suddenly the device started malfunctioning and Gita, the owner of the shop
 was very tensed. Sita is a very close friend of Gita and she offers to 
help her in fixing this issue.She starts rewriting the program to be embedded
 in the scanner like device. Can you help her out?
 
Input Format:
--------------------------
Input consists of 3 strings and a character. The 3 strings correspond to the
 names of 3 friends and the character corresponds to the letter inscribed on
 the gift item.

Output Format:
---------------------------
Output consists of the string 'yes' or 'no'. Output is yes when the letter in the 
gift item is the same as that of one of her friends. Otherwise it is no.

[Assume that the input consists of only upper case letters and it is not more
than 20 characters long.......] if it so print as "Invalid Input".

Sample Testcase:1
-----------------------------
input=MAHIRL
CHITRA
DEVI
C
output=yes

Sample Testcase:2
-----------------------------
input=MAHIRL
CHITRA
DEVI
A
output=no*/
import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1= sc.next();
        String s2= sc.next();
        String s3= sc.next();
        String s4= sc.next();
       
        if(s1.length()>20 || s2.length()>20 || s3.length()>20){
            System.out.println("Invalid Input");
        }
        else{
        if(s1.charAt(0)==s4.charAt(0) || s2.charAt(0)==s4.charAt(0) || s3.charAt(0)==s4.charAt(0)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        }
        
    }
}
// or the code can be
import java.util.*;
public class Caps {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String s4 = sc.next();
        int f=0;
        if(s1.length()>20 && s2.length()>20 && s3.length()>20){
            System.out.println("Invalid Input");
            f=1;
        }
        else {
            for (int i = 0; i < s1.length(); i++) {
                if (Character.isLowerCase(s1.charAt(i))) {
                    System.out.println("Invalid Input");
                    f = 1;
                    break;
                }
            }
            for (int i = 0; i < s2.length(); i++) {
                if (Character.isLowerCase(s2.charAt(i))) {
                    System.out.println("Invalid Input");
                    f = 1;
                    break;
                }
            }
            for (int i = 0; i < s3.length(); i++) {
                if (Character.isLowerCase(s3.charAt(i))) {
                    System.out.println("Invalid Input");
                    f = 1;
                    break;
                }
            }
            if (f == 0) {
                if (s1.charAt(0) == s4.charAt(0) || s2.charAt(0) == s4.charAt(0) || s3.charAt(0) == s4.charAt(0)) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }
}
// or can be the 👇🏼
import java.util.*;

public class Caps {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] words = {sc.next(), sc.next(), sc.next()};
        String s4 = sc.next();
        
        for (String word : words) {
            if (word.length() > 20 || !word.equals(word.toUpperCase())) {
                System.out.println("Invalid Input");
                return;
            }
        }
        
        for (String word : words) {
            if (word.charAt(0) == s4.charAt(0)) {
                System.out.println("yes");
                return;
            }
        }
        
        System.out.println("no");
    }
}
