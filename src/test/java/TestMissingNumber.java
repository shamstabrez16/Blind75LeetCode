import Binary.MissingNumber;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMissingNumber {
    private MissingNumber missingNumber;

    @Before
    public void setUp(){
        missingNumber = new MissingNumber();
    }

    @Test
    public void testCase1(){
        int[]  nums = {3,0,1};
        Assert.assertEquals(2,missingNumber.missingNumber(nums));
    }
    @Test
    public void testCase2(){
        int[]  nums = {0,1};
        Assert.assertEquals(2,missingNumber.missingNumber(nums));
    }

    @Test
    public void testCase3(){
        int[]  nums = {9,6,4,2,3,5,7,0,1};
        Assert.assertEquals(8,missingNumber.missingNumber(nums));
    }
}
