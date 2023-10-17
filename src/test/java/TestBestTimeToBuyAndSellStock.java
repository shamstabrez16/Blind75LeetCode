import Array.BestTimeToBuyAndSellStock_121;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBestTimeToBuyAndSellStock {

    private BestTimeToBuyAndSellStock_121 bestTimeToBuyAndSellStock121;
    @Before
    public void setUp(){
        bestTimeToBuyAndSellStock121 = new BestTimeToBuyAndSellStock_121();
    }

    @Test
    public void testCase1(){
        int[]  prices ={7,1,5,3,6,4};
        int expectedOutput = 5;
        Assert.assertEquals(bestTimeToBuyAndSellStock121.maxProfit(prices),expectedOutput);
    }
    @Test
    public void testCase2(){
        int[]  prices ={7,6,4,3,1};
        int expectedOutput = 0;
        Assert.assertEquals(bestTimeToBuyAndSellStock121.maxProfit(prices),expectedOutput);
    }
}
