import Array.FindMinimumInRotatedSortedArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFindMinimumInRotatedSortedArray {
    private FindMinimumInRotatedSortedArray rotatedSortedArray;

    @Before
    public void setUp() {
        rotatedSortedArray = new FindMinimumInRotatedSortedArray();
    }

    @Test
    public void TestCase1() {
        int[] nums = {3, 4, 5, 1, 2};
        int expectedOutput= 1;
        Assert.assertEquals(expectedOutput, rotatedSortedArray.findMin(nums));
    }
    @Test
    public void TestCase2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int expectedOutput= 0;
        Assert.assertEquals(expectedOutput, rotatedSortedArray.findMin(nums));
    }

    @Test
    public void TestCase3() {
        int[] nums = {11, 13, 15, 17};
        int expectedOutput= 11;
        Assert.assertEquals(expectedOutput, rotatedSortedArray.findMin(nums));
    }

    @Test
    public void TestCase4() {
        int[] nums = {3,1,2};
        int expectedOutput= 1;
        Assert.assertEquals(expectedOutput, rotatedSortedArray.findMin(nums));
    }
    @Test
    public void TestCase5() {
        int[] nums = {2,1};
        int expectedOutput= 1;
        Assert.assertEquals(expectedOutput, rotatedSortedArray.findMin(nums));
    }

    @Test
    public void TestCase6() {
        int[] nums = {5,1,2,3,4};
        int expectedOutput= 1;
        Assert.assertEquals(expectedOutput, rotatedSortedArray.findMin(nums));
    }
}
