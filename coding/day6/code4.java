/*Stella and friends have set out on a vacation to Manali. They have booked 
accommodation in a resort and the resort authorities headed by Bob, organize
 Campfires every night as a part of their daily activities. Stella volunteered 
herself for an activity called the "Stick Game".

Stella was given a total of N sticks. The length of i-th stick is Ai. Bob 
insists Stella choose any four sticks and make a rectangle with those sticks
 as its sides. Bob warns Stella not to break any of the sticks, she has to use
 sticks as a whole.
 
Also, Bob wants that the rectangle formed should have the maximum possible area
 among all the rectangles that Stella can make. Stella takes this challenge up 
and overcomes it. You have to help her know whether it is even possible to create
 a rectangle. If yes, then tell the maximum possible area of the rectangle.
 
Input Format:
------------------------
The first line of the input contains a single integer N denoting the number of sticks.
The second line of each test case contains N space-separated integers A1, A2, ...,AN 
denoting the lengths of sticks.

Output Format:
------------------------
Output a single line containing an integer representing the maximum possible area
for rectangle or output -1, if it's impossible to form any rectangle using the
available sticks.


Sample Testcase:1
----------------------
5
1 2 3 1 2
output=2

Sample Testcase:2
----------------------
4
1 2 2 3
output=-1*/
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
        ArrayList<Integer> al=new ArrayList<>();
        int f=0;
        for(Map.Entry<Integer,Integer> e : h.entrySet()){
            if(e.getValue()>=2){
                al.add(e.getKey());
                f=1;
                }
            }
            if(f==0){
                System.out.println(-1);
                }
            else{
            Collections.sort(al);
            int f1=al.get(al.size()-1);
            int s=al.get(al.size()-2);
            System.out.println(f1*s);
            }
        
    }
}
