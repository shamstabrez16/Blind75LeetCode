import Array.MaximumProductSubarray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMaximumProductSubarray {

    private MaximumProductSubarray maximumProductSubarray;

    @Before
    public void SetUp() {
        maximumProductSubarray = new MaximumProductSubarray();
    }

    @Test
    public void TestCase1() {
        int[] nums = {2, 3, -2, 4};
        int expectedOutput = 6;
        Assert.assertEquals(expectedOutput,maximumProductSubarray.maxProduct(nums));
    }

    @Test
    public void TestCase2() {
        int[] nums = {-2,0,-1};
        int expectedOutput = 0;
        Assert.assertEquals(expectedOutput,maximumProductSubarray.maxProduct(nums));
    }
    @Test
    public void TestCase3() {
        int[] nums = {2,-5,-2,-4,3};
        int expectedOutput = 24;
        Assert.assertEquals(expectedOutput,maximumProductSubarray.maxProduct(nums));
    }

}
