import java.util.*;

public class Solution {

    public static int[][] pascalTriangle(int N) {

        // Write your code here.

        int[][] ans=new int[N][];

        for(int i=0; i<N; i++){

            ans[i]=new int[i+1];

        }

        if(N==0)return ans;

        for(int i=0;i<N;i++){

            int j=0;

            while(j<=i){

                if(j==0 || j==ans[i].length-1)ans[i][j]=1;

                else ans[i][j]=ans[i-1][j-1]+ans[i-1][j];

                j++;

            }

        }

 

        return ans;

    }

}