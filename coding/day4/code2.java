/*LucarnosFilm Festival is an annual film festival and is also known for being a
 prestigious platform for art house films. This time at the Lucarnos Film festival
 there are N movies screened, each of different genre ranging from drama movies
 to comedy ones and teen movies to horror ones. Lucy is a huge fan of movies 
and visited the film festival, but she's not sure which movie she should watch.

Each movie can be characterized by two integers Li and Ri, denoting the length 
and the rating of the corresponding movie. Lucy wants to watch exactly one movie
 with the maximal value of Li × Ri. If there are several such movies, 
she would pick a one with the maximal Ri among them. If there is still a tie, 
she would pick the one with the minimal index among them.
 
Help Lucy pick a movie to watch at the film festival.
 
Input Format:
------------------------------
The first line of the input description contains an integer n. Assume that 
the maximum value for n as 50.The second line of the input description 
contains n integers L1, L2, ...,Ln.The following line contains n integers
R1, R2, ...,Rn.

Output Format:
----------------------------
Output a single integer i denoting the index of the movie that Lucy should 
watch in the film festival. Note that you follow 1-based indexing.


Sample Testcase:1
----------------------
input=2
1 2
2 1
output=1

Sample Testcase:2
----------------------
input=4
2 1 4 1
2 4 1 4
output=2
*/
        
import java.util.*;
public class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l1= new int[n];
        int[] r1= new int[n];
        int[] res = new int[n];
        int result=0;
        for(int i=0;i<n;i++){
             l1[i]= sc.nextInt();
        }
        for(int j=0;j<n;j++){
             r1[j]= sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n;i++){
                 res[i] = l1[i]*r1[i];
                 if(res[i]>max){
                     max =res[i];
                     result=i;
                 }
                 if(res[i]==max){
                     if(r1[i]>r1[result]){
                         max =res[i];
                         result=i;
                     }
                 }
        }
        System.out.println(result+1);
    }
}



import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r[] = new int[n];
        int l[] = new int[n];

        for (int i = 0; i < l.length; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < r.length; i++) {
            r[i] = sc.nextInt();
        }

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < r.length; i++) {
            a.add(r[i] * l[i]);
        }

        int maxVal = Collections.max(a);
        HashMap<Integer, Integer> h = new HashMap<>();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == maxVal) {
                h.put(i, a.get(i));
            }
        }

        if (h.size() == 1) {
            for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
                System.out.println(entry.getKey() + 1);
                return;
            }
        }
        int maxR = -1, minIndex = n;
        for (int index : h.keySet()) {
            if (r[index] > maxR || (r[index] == maxR && index < minIndex)) {
                maxR = r[index];
                minIndex = index;
            }
        }

        System.out.println(minIndex + 1);
    }
}



import java.util.*;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r[] = new int[n];
        int l[] = new int[n];

        for (int i = 0; i < l.length; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < r.length; i++) {
            r[i] = sc.nextInt();
        }

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < r.length; i++) {
            a.add(r[i] * l[i]);
        }

        HashMap<Integer, Integer> h = new HashMap<>();
        int m = Integer.MIN_VALUE;

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) >= m) {
                m = a.get(i);
            }
        }

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == m) {
                h.put(i, a.get(i));
            }
        }

        if (h.size() == 1) {
            for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
                System.out.println(entry.getKey() + 1);
            }
        } else {
            HashMap<Integer, Integer> h1 = new HashMap<>();
            int m1 = Integer.MIN_VALUE;

            for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
                int num = entry.getKey();
                if (r[num] >= m1) {
                    m1 = r[num];
                }
            }

            for (Map.Entry<Integer, Integer> entry : h.entrySet()) {
                int num = entry.getKey();
                if (r[num] == m1) {
                    h1.put(num, m1);
                }
            }

            if (h1.size() == 1) {
                for (Map.Entry<Integer, Integer> entry : h1.entrySet()) {
                    System.out.println(entry.getKey() + 1);
                    break;
                }
            } else {
                int minIndex = Integer.MAX_VALUE;
                for (Map.Entry<Integer, Integer> entry : h1.entrySet()) {
                    if (entry.getKey() < minIndex) {
                        minIndex = entry.getKey();
                    }
                }
                System.out.println(minIndex + 1);
            }
        }
    }
}

