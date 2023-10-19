package Array;
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid;
        while (l<=r) {
            mid = (r + l) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l]<=nums[mid]) { //left to right is sorted
                if(nums[l]<= target && target<nums[mid]){
                    r = mid-1;
                }
                else{
                    l = mid+1;
                }
            } else{
                //right to left sorted
                if(nums[mid]< target && target<=nums[r]){
                    l = mid+1;
                }
                else{
                    r = mid-1;
                }
            }
        }
        return -1;
    }
}
