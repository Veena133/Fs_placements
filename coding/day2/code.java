import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = n%10;
        if(rem== 3 || rem== 8){
            System.out.println("Lucky Winner");
        }
        else{
            System.out.println("Not a Lucky Winner");
        }
        
    }
}
