import Array.MaximumSubArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestMaximumSubArray {

    private MaximumSubArray maximumSubArray;

    @Before
    public void setUp() {
        maximumSubArray = new MaximumSubArray();
    }

    @Test
    public void TestCase1(){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int expected = 6;
        Assert.assertEquals(maximumSubArray.maxSubArray(nums),expected);
    }
    @Test
    public void TestCase2(){
        int[] nums = {1};
        int expected = 1;
        Assert.assertEquals(maximumSubArray.maxSubArray(nums),expected);
    }
    @Test
    public void TestCase3(){
        int[] nums = {5,4,-1,7,8};
        int expected = 23;
        Assert.assertEquals(maximumSubArray.maxSubArray(nums),expected);
    }

    @Test
    public void TestCase4(){
        int[] nums = {-1};
        int expected = -1;
        Assert.assertEquals(maximumSubArray.maxSubArray(nums),expected);
    }
}
