/*You are designing a real-time payment validation system for an online
marketplace. The system needs to verify whether a customer's payment 
of any two transactions can exactly match the total purchase amount,
ensuring accuracy in transaction processing.

If such a pair of payments is found, the program should return Yes;
otherwise, it should return No.

-Your task is to write the program for the above mentioned.

Sample Testcase:1
----------------------------------
input=0 -1 2 -3 1
-2
output=Yes


Sample Tescase:2
---------------------------------
input=1 -2 1 0 5
0
output=No
  */

import java.util.*;
class Problem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s[] =sc.nextLine().split(" ");
        int a[] = new int[s.length];
        for(int i=0;i<a.length;i++ ){
            a[i]=Integer.parseInt(s[i]);
        }
        int tar = sc.nextInt();
        int flag=1;
        for(int i=0;i<a.length-1;i++){
            int sum=a[i]+a[i+1];
            if(sum==tar){
                System.out.println("Yes");
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println("No");
        }
    }
}
