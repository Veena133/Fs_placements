/*
Lucarnos Film Festival is an annual film festival and is also known
for being a prestigious platform for art house films. Lucy, being a 
movie lover visits the Lucarnos Film Festival. There were many films 
screened in the show, of which Lucy somehow choose the best movie of 
her choice and set off to watch it.

The movie which Lucy chose to watch has N sequences. A sequence is 
defined as a series of scenes in a movie that form a distinct narrative
unit. Lucy likes a sequence better if the sequence contains her favorite
sequence in the movie as a substring.
 
Given the sequence and Lucy’c favorite sequence(F) check whether her 
favorite sequence is contained in the sequence.
 
Input Format:
---------------------
The first line of the input contains an integer N, which corresponds to 
the length of the sequence.
The second line of the input contains N space-separated integers, which 
corresponds to the sequence.
The third line of the input contains an integer n, which corresponds to
the length of favorite sequence F.
The last line of the input contains n space-separated integers, which 
corresponds to the favorite sequence.

Output Format:
---------------------
Print "Yes" (Without quotes)if the sequence contains Lucy’sfavourite 
sequence otherwise print "No" (Without quotes).


Sample Testcase:1
---------------------------
6
1 2 3 4 5 6
3
2 3 4
output=Yes

Sample Testcase:1
---------------------------
6
22 5 6 33 1 4
2
4 15
output=No*/
import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int on = sc.nextInt();
        int a[] = new int[on];
        for(int i=0;i<on;i++){
            a[i]=sc.nextInt();
        }
        int fn = sc.nextInt();
       int a1[] = new int[fn];
        for(int i=0;i<fn;i++){
            a1[i]=sc.nextInt();
        }
        
            int c=0;
            for(int i=0;i<on;i++){
                for(int j=0;j<fn;j++){
                    if(a[i]==a1[j]){
                        c++;
                    }
                }
                if(c==fn){
                    System.out.println("Yes");
                    break;
                }
                else{
                    System.out.println("No");
                }
            }
    }
}
import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int on = sc.nextInt();
        int a[] = new int[on];
        StringBuilder s= new StringBuilder();
        StringBuilder s1= new StringBuilder();
        
        for(int i=0;i<on;i++){
            a[i]=sc.nextInt();
            s=s.append(a[i]);
        }
        int fn = sc.nextInt();
       int a1[] = new int[fn];
        for(int i=0;i<fn;i++){
            a1[i]=sc.nextInt();
            s1=s1.append(a1[i]);
        }
        String k=s.toString();
        String l=s1.toString();
        if(k.contains(l)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
import java.util.*;
public class ReviewMovieSliding {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int on = sc.nextInt();
        int a[] = new int[on];
        for(int i=0;i<on;i++){
            a[i]=sc.nextInt();
        }
        int fn = sc.nextInt();
        int a1[] = new int[fn];
        for(int i=0;i<fn;i++){
            a1[i]=sc.nextInt();
        }
        int l=0;
        int k=a1.length;
        int f=0;
        for(int r=0;r<on;r++){
            if(r-l==k){
                l++;
            }
            if((r-l+1)==k){
               int []c1=Arrays.copyOfRange(a,l,r+1);
                if(Arrays.equals(c1,a1)){
                    System.out.println("Yes");
                    f=1;
                    return;
                }
            }
        }
        if(f==0){
            System.out.println("No");
        }

    }

}
