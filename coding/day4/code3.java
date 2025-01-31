
/*You are developing a real-time chat application. One of the features 
is to detect the longest sequence of unique words typed by a user in 
a single message. The goal is to help users avoid repeating words while 
forming meaningful sentences.

Given a message (a string of words separated by spaces),
find the length of the longest substring that contains only 
unique words without repetition.

Sample Testcase:1
-----------------------------------------
input=abcabcbb
output=3*/
import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> h = new HashSet<>();
        int l=0;
        int max=0;
        for(int r=0;r<s.length();r++){
            char c =s.charAt(r);
            while(h.contains(c)){
                h.remove(s.charAt(l));
                l++;
            }
            h.add(c);
            max=Math.max(max,r-l+1);
        }
        System.out.println(max);
    }
}
