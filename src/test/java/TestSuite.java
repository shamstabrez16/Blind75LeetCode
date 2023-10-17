import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import String.ValidParentheses;
import String.ValidPalindrome;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestBestTimeToBuyAndSellStock.class,
        TestContainsDuplicate.class,
        TestMaximumSubArray.class,
        TestMaximumProductSubarray.class,
        TestProductOfArrayExceptSelf.class,
        TestTwoSum.class,
        ValidParentheses.class,
        ValidPalindrome.class
})
public class TestSuite {
}
