import org.junit.Assert;
import org.junit.Before;
import Array.SearchInRotatedSortedArray;
import org.junit.Test;

public class TestSearchInRotatedSortedArray {

    private  SearchInRotatedSortedArray searchInRotatedSortedArray;
    @Before
    public void setUp(){
        searchInRotatedSortedArray = new SearchInRotatedSortedArray();
    }

    @Test
    public void testCase1(){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        int expectedOutput =4;
        Assert.assertEquals(expectedOutput,searchInRotatedSortedArray.search(nums,target));


    }
    @Test
    public void testCase2(){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        int expectedOutput =-1;
        Assert.assertEquals(expectedOutput,searchInRotatedSortedArray.search(nums,target));


    }
    @Test
    public void testCase3(){
        int[] nums = {1};
        int target = 0;
        int expectedOutput =-1;
        Assert.assertEquals(expectedOutput,searchInRotatedSortedArray.search(nums,target));
    }
    @Test
    public void testCase4(){
        int[] nums = {3,1};
        int target = 1;
        int expectedOutput =1;
        Assert.assertEquals(expectedOutput,searchInRotatedSortedArray.search(nums,target));


    }
}
