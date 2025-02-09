/*The Pan Am 73 flight from Bombay to New York en route Karachi and Frankfurt was
hijacked by a few Palestinian terrorists at the Karachi International Airport.
Despite the alarming situation prevailing inside the flight, the senior flight 
purser Neerja Banhot had to wither her fear and rise to the occasion to take extra
care of her passengers on board.
 
Firstly, she and her crew decided to provide food and drinks to the passengers. 
Given ‘n’ the number of rows of seats in the aircraft and the total number of 
people in each row, can you determine the total number of passengers in the flight.

Input Format :
------------------------
The first line of input consists of an integer n, corresponding to the number of 
rows in the aircraft.
The next n lines of input consist of integers that correspond to the number of
people in each row.

Output Format :
-------------------------
The first line of output consists of n integers corresponding to the number of 
people in each row.
The second line of output consists of an integer corresponding to the total 
number of people in the aircraft.
Print Invalid Input and terminate the process of getting inputs if any of the 
inputs is not a positive number.

Sample Testcase:1
----------------------
input=5
12
28
30
20
45
output=12 28 30 20 45
135


Sample Testcase:2
----------------------
input=6
12
28
30
20
-45
output=Invalid Input*/
import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int r=sc.nextInt();
        if(r<0){
            System.out.println("Invalid Input");
        }
        else{
        int a[]= new int[r];
        int sum=0,f=0;
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            if(a[i]<0){
                System.out.println("Invalid Input");
                f=1;
                break;
            }
        }
        if(f==0){
        for(int i=0;i<a.length;i++){
         sum+=a[i];   
         System.out.print(a[i]+" ");
        }
        System.out.println(sum);
        }
        }
    }
}
