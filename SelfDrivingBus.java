import java.io.*;
import java.util.*;


/* Self Driving Bus 
The ruler of Treeland wants to implement a self-driving bus system and asks tree-loving Alex to plan the bus routes. Alex decides that each route must contain a subset of connected cities; a subset of cities is connected if the following two conditions are true:

There is a path between every pair of cities which belongs to the subset.
Every city in the path must belong to the subset.
*/
public class Solution {

    public static void main(String[] args) throws Exception {
        int n=0;
         BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(in.readLine());
        n+=num;
        n+=num-1;
        System.out.print(n);
    }
}