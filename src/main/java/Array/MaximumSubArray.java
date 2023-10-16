package Array;

public class MaximumSubArray {

    public  int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum =  Integer.MIN_VALUE;
        for (int num : nums) {
            currentSum = currentSum + num;
            maxSum = Math.max(maxSum, currentSum);
            if (currentSum < 0) currentSum = 0;
        }
        return  maxSum;
    }
}
