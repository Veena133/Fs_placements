/*It is IPL Season and the first league match of Dhilip’s favorite team,
 "Chennai Super Kings". The CSK team is playing at the IPL after 2 years 
and like all Dhoni lovers, Dhilip is also eagerly awaiting to see Dhoni back in
action.

After waiting in long queues, Dhilip succeeded in getting the tickets for 
the big match. On the ticket, there is a letter-code that can be represented as 
a string of Latin letters.

Dhilip believes that the CSK Team will win the match in case exactly two 
different letters in the code alternate. Otherwise, he believes that the
 team might lose. Please see note section for formal definition of alternating code.

You are given a ticket code. Please determine, whether CSK Team will win 
the match or not based on Dhilip’sconviction. Print "Yes" or "No" corresponding
 to the situation.

Note:
-----------------
Two letters x, y where x != y are said to be alternating in a code, if code is
of form "xyxyxy..."(case insensitive).

Input Format:
-----------------------
First and only line of the input contains a string S denoting the letter code on the ticket.

Output Format:
------------------------
Output a single line containing "Yes" (without quotes) based on the conditions
given and "No" otherwise.

Sample Testcase:1
------------------------
input=ABABAB
output=Yes

Sample Testcase:2
------------------------
input=ABC
output=No*/
import java.util.Scanner;

public class CharacterAlternateChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        int f=0;
        if(s.length()==1){
            System.out.println("No");
            return;
        }
        for(int i=2;i<s.length();i++){
            if(s.charAt(i-2)!=s.charAt(i)) {
                f = 1;
                break;
            }
        }
        if(f==1){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}

