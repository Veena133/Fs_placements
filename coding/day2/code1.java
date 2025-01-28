
/*You are given the following Java program that attempts to print all 
the elements of an array. However, there is an error in the code 
. Your task is to debug the code to fix the issue and ensure it
 prints all elements of the array correctly. 
The program should read input from the user.

Sample Input:
-----------------------
input=5, 10, 15, 20*/

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[4];
        int sum = 0;
        String s= sc.nextLine();
        String s1[]= s.split(",");
        for (int i = 0; i < arr.length; i++) { 
            arr[i]=Integer.parseInt(s1[i]);
        }
        for (int i = 0; i <arr.length; i++) { 
            
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

