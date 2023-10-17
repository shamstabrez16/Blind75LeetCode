import Array.TwoSum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTwoSum {
    private TwoSum twoSum;

    @Before
    public void SetUp() {
        twoSum = new TwoSum();
    }

    @Test
    public void testCase1() {
        int[] nums = {3,3};
        int target = 6;
        int[] expectedOutput ={0,1};
        Assert.assertArrayEquals(expectedOutput,twoSum.twoSum(nums,target));
    }
    @Test
    public void testCase2() {
        int[] nums = {3,2,4};
        int target = 6;
        int[] expectedOutput ={1,2};
        Assert.assertArrayEquals(expectedOutput,twoSum.twoSum(nums,target));
    }
    @Test
    public void testCase3() {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] expectedOutput ={0,1};
        Assert.assertArrayEquals(expectedOutput,twoSum.twoSum(nums,target));
    }
}
