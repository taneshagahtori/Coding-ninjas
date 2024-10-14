import java.util.*;
public class Solution {
    static int mazeObstacles(int n, int m, ArrayList<ArrayList<Integer>> mat) {
        // Write your code here.
        int mod=1000000007;
        int[][] dp=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(mat.get(i).get(j)==-1){
                    dp[i][j]=0;
                    continue;
                }
                else if(i==0 && j==0){
                    dp[i][j]=1;
                    continue;
                }
                else{
                    int up=0;
                int left=0;
                if(i>0){
                    up=dp[i-1][j];
                }
                if(j>0){
                    left=dp[i][j-1];
                }
                dp[i][j]=(up+left)%mod;
                }
            }
        }
        return dp[n-1][m-1];
    }

}
