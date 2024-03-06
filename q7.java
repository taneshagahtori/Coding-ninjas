import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {

    public static void rotate(ArrayList<ArrayList<Integer>> mat,int rs, int cs, int n, int m){
        int last = mat.get(rs).get(cs);
        // Traverse First Row 
        for(int i = cs + 1 ; i < m ; i++){
            int temp = last;
            last = mat.get(rs).get(i);
            mat.get(rs).set(i, temp);
        }
        // System.out.println(last);
        // last column
        for(int i = rs + 1; i < n; i ++){
            int temp = last;
            last = mat.get(i).get(m-1);
            mat.get(i).set(m-1, temp);
        }
        // System.out.println( last);
        // last row
        for(int i = m-2 ; i > cs - 1 ; i--){
            int temp = last;
            last = mat.get(n-1).get(i); 
            mat.get(n-1).set(i, temp);
        }
        // System.out.println(last);
        // First column
        for(int i = n-2; i > rs- 1; i --){
            int temp = last;
            last = mat.get(i).get(cs);
            mat.get(i).set(cs, temp);
        }
        // System.out.println(last);

        // mat.forEach(row -> {
        //     row.forEach(column -> System.out.print(column + " "));
        //     System.out.println("\n");
        // });

    }
    public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        // Write your code here.
        // rotate(mat,0, 0, n, m);
        if( n == 1 || m == 1){
            return;
        }
        for(int i = 0 ; i < Math.min(n/2, m/2) ; i++){
            if(i < n - i && i < m - i){
                rotate(mat, i, i , n - i , m - i);
            }
            
        }
        

    }
}