/*The Pan Am 73 flight from Bombay to New York en route Karachi and Frankfurt was 
hijacked by a few Palestinian terrorists at the Karachi International  Airport.
                                                                                 
The senior flight purser Neerja Banhot had to wither her fear and start
 evacuating the passengers on board. She pleaded the hijackers to release
 the oldest and the youngest person in the aircraft. Heeding to her 
plea the chief of the hijacker agreed to let go the oldest and the
 youngest. Given the ages of the passengers find the oldest and the 
youngest.

Input Format :
--------------------------
The input consists of n+1 lines.
The first line of input consists of an integer n, corresponding to
the number of passengers in the aircraft.
The next n lines of input consist of  n integers that correspond to
the age of the passengers.

Output Format :
-------------------------
The output consists of 2 integers corresponding to the oldest and the youngest.
Print Invalid Input and terminate the process of getting inputs 
if n or any of the ages is not a non zero positive number.

Sample Testcase:1
----------------------------
input=5 
1 3 5 2 4 
Output=1 5

Sample Testcase:2
----------------------------
input=6 
68 -45
Output/=Invalid Input
*/
import java.util.*;
public class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int f=0;
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Invalid Input");
            f=1;
            }
else{
           int a[]= new int[n];
        for(int i=0;i<n;i++){
         a[i]=sc.nextInt();
            if(a[i]<0){
           System.out.println("Invalid Input");
                f=1;
                break;
                }
             }
             
        if(f==0){
            Arrays.sort(a);
            System.out.println(a[0]+" "+a[n-1]);
        }
    }
    

}
}
//or can written as 👇🏼
import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
            return;
        }
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]<=0){
            System.out.println("Invalid Input");
                return;
        }
        }
        Arrays.sort(a);
        System.out.println(a[0]+" "+a[n-1]);
    }
}
