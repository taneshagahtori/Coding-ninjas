public class Solution {
    public static int NthRoot(int n, int m) 
    {
        // Write your code here.
        int s=1;
        while(Math.pow(s, n)<=m)
        {
            if(Math.pow(s, n)==m)
            {
                return s;
            }
            s++;
        }
        return -1;
    }
}