
/*

With the initiative of the Students Council of Sherland State University, 
the College Management has inaugurated a mini library in the hostel premises.
There are N students living in the hostel. Any student can use the library but
 on a condition that only one student should avail it at a time. Based on this
 condition, the Hostel Warden came up with a timetable for library's usage in
 order to avoid the conflicts:

--The first student starts to use the library at the time O and should finish the
reading not later than at the time A1.
--The second student starts to use the library at the time A1 and should finish
the reading not later than at the time A2.And so on.
--The N-th student starts to use the library at the time AN-1 and should finish 
the reading not later than at the time AN
--The holidays in Sherland are approaching, so today each of these N students 
wants to read some new edition of "Heart of Darkness". The i-th student needs 
Bi units of time to read the book.

The students have understood that probably not all of them will be able to read 
everything they want from the book. How many students will be able to read the
book without violating the schedule?
 
Input Format:
-------------------------
The first line of input contains a single integer N denoting the number of
students. Assume that the maximum value for N as 50.
The second line contains N space-separated integers A1, A2, ...,AN denoting
the moments of time by when the corresponding student should finish reading.
The third line contains N space-separated integers B1, B2, ...,BN denoting
the time required for each of the students to read.

Output Format:
--------------------------
Output a single line containing the number of students that will be able to 
finish reading.

Sample Testcase:1
---------------------------
3
1 10 15
1 10 3
output=2

Sample Testcase:2
---------------------------
3
10 20 30
15 5 20
output=1
*/
import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int r[]= new int[n];
        int bt[]= new int[n];
        for(int i=0;i<n;i++){
            r[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            bt[i]=sc.nextInt();
        }
        int c=0;
        int i=0;
        int sum=0;
        for(int j=0;j<bt.length;j++){
            sum=sum+bt[j];
            if(sum<=r[i]){
                c++;
            }
            i++;
        }
        System.out.println(c);
    }
}
