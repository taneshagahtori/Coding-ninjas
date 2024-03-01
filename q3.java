import java.util.ArrayList;

public class Solution {

    public static int findPeakElement(ArrayList<Integer> arr) {

        // Write your code here.

        int n=arr.size();

        if(n==1) return 0;

        if(arr.get(0)>arr.get(1)) return 0;

        if(arr.get(n-1)>arr.get(n-2)) return n-1;

        int l=1,h=n-2;

        while(l<=h){

            int mid=(l+h)/2;

            if(arr.get(mid)>arr.get(mid-1)&&arr.get(mid)>arr.get(mid+1)){

                return mid;

            }

            if(arr.get(mid)>arr.get(mid-1)){

                l=mid+1;

            }else{

                h=mid-1;

            }

        }

        return -1;

    }

};