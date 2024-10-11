public class Solution {
    public static int ninjaTraining(int n, int points[][]) {

        // Write your code here..
        int[] prev=new int[4];

        prev[0] = Math.max(points[0][1], points[0][2]);
        prev[1] = Math.max(points[0][0], points[0][2]);
        prev[2] = Math.max(points[0][0], points[0][1]);
        prev[3] = Math.max(points[0][0], Math.max(points[0][1], points[0][2]));

        for(int i=1;i<n; i++){
            int[] temp=new int[4];
            for(int j=0; j<4; j++){
                temp[j]=0;
                for(int t=0; t<=2; t++){
                    if(t!=j){
                        temp[j]=Math.max(temp[j], points[i][t]+ prev[t]);
                    }
                }
            }
            prev=temp;
        }
        return prev[3];
    }

}
