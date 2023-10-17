import org.junit.Assert;
import org.junit.Before;
import String.ValidPalindrome;
import org.junit.Test;

public class TestValidPalindrome {
    private ValidPalindrome validPalindrome;
    @Before
    public void setUp(){
        validPalindrome = new ValidPalindrome();
    }

    @Test
    public void TestCase1(){
       String  s = "A man, a plan, a canal: Panama";
        Assert.assertTrue(validPalindrome.isPalindrome(s));

    }
    @Test
    public void TestCase2(){
        String s = " ";
        Assert.assertTrue(validPalindrome.isPalindrome(s));
    }
    @Test
    public void TestCase3(){
        String  s = "race a car";
        Assert.assertFalse(validPalindrome.isPalindrome(s));


    }
    @Test
    public void TestCase4(){
        String  s = "0P";
        Assert.assertFalse(validPalindrome.isPalindrome(s));


    }
}
