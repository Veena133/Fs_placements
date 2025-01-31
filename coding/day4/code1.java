/*
You are helping a teacher who is organizing a class quiz. The teacher 
gives you a list of student IDs who participated in the quiz. Some 
students may have participated more than once, and the teacher wants
 to know which students took the quiz exactly twice. Your task is to
 print out the IDs of the students who participated exactly twice, 
in the order they first appear in the list. If no student participated 
exactly twice, you should print a message saying "No students participated exactly twice."

Determine which students participated exactly twice. If there are
 no such students, print the message "No students participated exactly twice."

Input Format:
----------------------------
The first input will be an integer n representing the number of student IDs in the list.
The second input will be n space-separated integers representing the student IDs.

Output Format:
----------------------------
If any student IDs appear exactly twice, print each of those IDs in the order 
of their first appearance.
If no student participated exactly twice, output the message: 
"No students participated exactly twice."

Sample Testcase:1
----------------------------
input=5
100 101 102 103 104
output=No students participated exactly twice

Sample Testcase:2
----------------------------
input=6
101 102 103 101 104 102
output=101 102*/
/*import java.util.*;
class Solution{
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        ArrayList<Integer> a1= new ArrayList<>();
        int k=0;
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                }
            }
            if(c==2 && !a1.contains(a[i])){
                a1.add(a[i]);
            }
        }
        if(a1.isEmpty()){
            System.out.println("No students participated exactly twice");
        }
        else{
        System.out.println(a1);
        }
        
    }
}*/
import java.util.*;
public class Solution{
        public static void main(String[] main){
            Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<a.length;i++){
                a[i]=sc.nextInt();
                }
           HashMap<Integer,Integer>  h=  new HashMap<>();
            for(int i=0;i<a.length;i++){
                h.put(a[i],h.getOrDefault(a[i],0)+1);
                }
            int c=0;
            for(Map.Entry<Integer,Integer> e : h.entrySet()){
                if(e.getValue()==2){
                    System.out.print(e.getKey()+" ");
                    c++;
                    }
                    }
            if(c==0){
                System.out.println("No students participated exactly twice");
                }
}
}
