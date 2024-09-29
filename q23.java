import java.util.* ;
import java.io.*; 
public class Solution {
    public static int frogJump(int n, int heights[]) {

        // Write your code here..
        int prev=0;
        int prev2=0;
        for(int i=1; i<n; i++){
            int fs=prev+ Math.abs(heights[i]-heights[i-1]);
            int ss= Integer.MAX_VALUE;
            if(i>1){
                ss=prev2 + Math.abs(heights[i]-heights[i-2]);
            }    
            int curi=Math.min(fs, ss);
            prev2=prev;
            prev=curi;

            
        }
        return prev;
    }

}
