package Array;
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int max =nums[0];
        int currentMax = nums[0], currentMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int tempMax = currentMax;
            currentMax = Math.max(Math.max(currentMax *nums[i], currentMin*nums[i]),nums[i] );
            currentMin = Math.min(Math.min(tempMax*nums[i],currentMin*nums[i]), nums[i]);
            max = Math.max(currentMax,max);
        }
        return max;
    }
}
