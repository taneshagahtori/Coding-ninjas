public class Solution {
    public static int[] getSecondOrderElements(int n, int[] a) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] < largest) {
                secondLargest = a[i];
            }


            if (a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            } else if (a[i] < secondSmallest && a[i] > smallest) {
                secondSmallest = a[i];
            }
        }

    
        return new int[]{secondLargest, secondSmallest};
    }
}
