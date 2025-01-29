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
