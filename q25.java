import java.util.ArrayList;

public class Solution {
    
    public static long houseRobber(int[] valueInHouse) {
		//Stores the length of the array
        int n = valueInHouse.length;
    
        if (n == 1) {
            return valueInHouse[0];
        }
        //Create two ArrayList for comparing the arrays
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            if (i != 0) arr1.add(valueInHouse[i]);
            if (i != n - 1) arr2.add(valueInHouse[i]);
        }
        //Calculate the max value
        long ans1 = maximumNonAdjacentSum(arr1);
        long ans2 = maximumNonAdjacentSum(arr2);
        
        // Return the maximum of the two
        return Math.max(ans1, ans2);
    }
    
    // Helper method to find the maximum sum when no adjacent elements are allowed
    public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
        int n = nums.size();
        
        // Edge case: if the list is empty
        if (n == 0) return 0;
        
        int prev = nums.get(0);
        int prev2 = 0;

        // Loop through the list to calculate the maximum non-adjacent sum
        for (int i = 1; i < n; i++) {
            int take = nums.get(i);
            if (i > 1) {
                take += prev2;
            }
            int notTake = prev;
            int curr = Math.max(take, notTake);
            prev2 = prev;
            prev = curr;
        }
        return prev;
    }
}
