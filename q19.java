import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		// write your code here
		long sum=0;
		long max=Long.MIN_VALUE;
		for(int i=0; i<n; i++){
			sum+=arr[i];
			if(sum>max){
				max=sum;
			}
			if(sum<0){
				sum=0;
			}
		}
		if(max<0){
			max=0;
		}
	return max;
	}
}
