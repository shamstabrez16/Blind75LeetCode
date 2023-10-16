package Array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] pp = new int[nums.length];
        pp[0]=1;
        int[] sp = new int[nums.length];
        sp[nums.length-1]=1;
        for (int i = 0; i <nums.length-1; i++) {
            pp[i+1]= pp[i]*nums[i];
        }
        for (int i = nums.length-1; i >=1; i--) {
            sp[i-1]= sp[i]*nums[i];
            pp[i]= pp[i]*sp[i];
        }
        pp[0]= pp[0]*sp[0];
        return pp;
    }

}
