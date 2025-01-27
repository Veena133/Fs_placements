/*
The room that Patrick and Johnny were staying was very big. They felt lazy to 
walk inside the room from the bed's location to another location. So they wanted
 to change the position of the bed. The shape of the room is a Square. They decided
 to place the bed at the centre of the room so that their walking distance would 
be minimised. Can you please help them in placing the bed at the centre?
                                                                            
Given the coordinates of the left bottom vertex of the square room and the length 
of the side, you need to write a program to determine the coordinates of the 
centre of the room.

[Assumption --- Length of the side is always even]
 
Input Format:
----------------------------
Input consists of 3 integers.

Explanation:
--------------------
The first integer corresponds to the x-coordinate of the left bottom vertex. 
The second integer corresponds to the y-coordinate of the left bottom vertex.
The third integer corresponds to the length of the square.

Output Format:
----------------
Refer Sample Input and Output for exact formatting specifications.
 
Sample Testcase:1
-------------------
input=10 30 16
output=(18,38)*/
import java.util.*;
class Problem{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String a[] = s.split(" ");
        int a1[] = new int [3];
        for(int i=0;i<a.length;i++){
            a1[i]= Integer.parseInt(a[i]);
        }
        int mid = a1[2]/2;
        System.out.println("("+(a1[0]+mid)+","+(a1[1]+mid)+")");
        
    }
}
