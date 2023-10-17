import Array.ContainsDuplicate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestContainsDuplicate {

    private ContainsDuplicate containsDuplicate;
    @Before
    public void setup(){
        containsDuplicate = new ContainsDuplicate();
    }
    @Test
    public void testCase1(){
        int[] nums={1,2,3,1};
        Assert.assertTrue(containsDuplicate.containsDuplicate(nums));
    }
    @Test
    public void testCase2(){
        int[] nums={1,2,3,4};
        Assert.assertFalse(containsDuplicate.containsDuplicate(nums));
    }
    @Test
    public void testCase3(){
        int[] nums={1,1,1,3,3,4,3,2,4,2};
        Assert.assertTrue(containsDuplicate.containsDuplicate(nums));
    }
}
