/*New Year is shortly arriving and the students of St. Philip’s College of 
Business are eager to receive the freshers for the coming year. The Welcome 
party for the freshers is going to be organized in a week’s time and in connection 
to that the College Management has ordered the students to renovate their class 
room block. The Class room block has N rooms in it numbered from 1 to N. Each room
 is currently painted in one of the red, blue or green colors. Students are given 
configuration of colors of their class room block by an array consisting of N values. 
In this array, color red will be denoted by '1', green by '2' and blue by '3'.
 
The Management wanted the class room block to be repainted such that each class room
 has same color. For painting, Students have all the 3 color paints available and 
mixing any 2 color paints will result into 3rd color paint i.e

1 + 2 = 3
2 + 3 = 1
3 + 1 = 2
For example, if a room is already painted in green color, painting that room red color,
 will make the color of the room blue.

Also, students have many buckets of paint of each color. Simply put, you can assume that 
they will not run out of paint. Students are a bit lazy, so they does not want to work 
much and therefore, has asked you to find the minimum number of rooms they have to repaint
 (possibly zero) in order to have all the rooms with same color as told by the Management.
 Can you please help them?
 
Input Format:
---------------------
First line of input contains an integer N, denoting the number of class rooms in the
 College’s class room block. Assume that the maximum value for N as 50.
Next line of input contains N values, denoting the current color configuration of rooms.

Output Format:
-----------------------
Print the minimum number of rooms that need to be painted in order to have all
 the rooms painted with same color i.e red, blue or green.


Sample Testcase:1
-----------------------
input=3
1 2 1
output=1

Sample Testcase:2
-----------------------
input=3
1 1 1
output=0
*/
import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
         int a[]=new int[n];
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            h.put(a[i],h.getOrDefault(a[i],0)+1);
        }
        int max=0;
        int c=0;
        int count=0;
        int f=0;       
        for(Map.Entry<Integer,Integer> e : h.entrySet()){
            count+=e.getValue();
            if(e.getValue()>max){
                max=e.getValue();
            }
            if(e.getValue()==0){
                c++;
                f=1;
        }
}
        if(c==2 && f==1){
            
            System.out.println(0);
            }
        else{

        System.out.println(count-max);
        }
    }
}
//Collections.max(h.values())
//above is the method for arraylist,hashmap etccc…max,sort,min…

