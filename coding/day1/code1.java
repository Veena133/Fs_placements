/*But Johnny remembers that the resort is located at the midpoint of a line joining
 Airport and the Disneyland. Can you help them to reach the resort correctly?
 
 
Given the coordinates of the 2 end points of a line (x1,y1) and (x2,y2), 
Find the midpoint of the line.

Input Format:
------------------
4 Space separated integers

Output Format:
---------------------
All floating point values are displayed correct to 1 decimal place.

Sample Testcase:1
--------------------------
input=1 2 3 4
output=2.0,3.0

Sample Testcase:2
-------------------------
case=2
input=-5 -5 5 5
output=0.0,0.0*/
import java.util.*;
class Problem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String a1[] = s.split(" ");
        int a[] = new int[4];
        for(int i=0;i<a1.length;i++){
            a[i]=Integer.parseInt(a1[i]);
        }
        double x1= (a[0]+a[2])/2.0;
        double x2= (a[1]+a[3])/2.0;

        System.out.printf("%.1f,%.1f",x1,x2);
        
    }
}
// "%.1f" for precisions
