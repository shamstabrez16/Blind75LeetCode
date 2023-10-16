package Array;

public class MaximumSubArray {

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum =  Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            currentSum=currentSum+nums[i];
            maxSum = Math.max(maxSum,currentSum);
            if(currentSum<0){currentSum=0;}
        }
        return  maxSum;


    }
}
