/*

Find the sum of the corresponding elements in 2 arrays.

Input Format:
----------------------
Input consists of 2n+1 integers.
The first integer corresponds to ‘n’ , the size of the array. 
The next ‘n’ integers correspond to the elements in the first array. 
The last 'n' integers correspond to the elements in the second array.

Note: Assume that the maximum value of n is 15.

Output Format:
----------------------------
space separated integers after finding the sum

Sample Testcase:1
------------------------------
input=5 1 2 3 4 5 6 7 8 9 10
output=7 9 11 13 15 


Sample Testcase:2
------------------------------
input=5 1 2 3 4 5
output=Incompatible
*/

import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        if(s.length!=((Integer.parseInt(s[0])*2)+1)){
            System.out.println("Incompatible");
        }
        else{
            int a[] = new int[s.length-1];
            int n=Integer.parseInt(s[0]);
            for(int i=0;i<a.length;i++){
                a[i]=Integer.parseInt(s[i+1]);
            }
            int l=0;
            int r=a.length/2;
            int ans[] = new int[n];
            for(int i=0;i<ans.length;i++){
                ans[i]=a[l]+a[r];
                l++;
                r++;
            }
            System.out.println(Arrays.toString(ans));
        }
    }
}
// or use this code
*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s[]=sc.nextLine().split(" ");
        int n=Integer.parseInt(s[0]);
        if(n!=(s.length-n-1)){
            System.out.println("Incompatbile");
            return;
        }
        else{
            int m[]=Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
            int a[]=Arrays.copyOfRange(m,1,n+1);
            int b[]=Arrays.copyOfRange(m,n+1,m.length);
            int res[]=new int[n];
            for(int i=0;i<n;i++){
                res[i]=a[i]+b[i];
            }
            System.out.println(Arrays.toString(res));
        }
    }
}
