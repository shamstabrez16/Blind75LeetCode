import Array.ProductOfArrayExceptSelf;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestProductOfArrayExceptSelf {
    private ProductOfArrayExceptSelf productOfArrayExceptSelf;

    @Before
    public void setUp(){
        productOfArrayExceptSelf = new ProductOfArrayExceptSelf();
    }

    @Test
    public void testCase1(){
        int[] nums = {1,2,3,4};
        int[] expectedArray ={24,12,8,6};
        Assert.assertArrayEquals(productOfArrayExceptSelf.productExceptSelf(nums),expectedArray);
    }
    @Test
    public void testCase2(){
        int[] nums = {-1,1,0,-3,3};
        int[] expectedArray ={0,0,9,0,0};
        Assert.assertArrayEquals(productOfArrayExceptSelf.productExceptSelf(nums),expectedArray);
    }

}
