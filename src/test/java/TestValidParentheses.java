import String.ValidParentheses;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestValidParentheses {

    private ValidParentheses validParentheses;

    @Before
    public void setUp(){
        validParentheses = new ValidParentheses();
    }


    @Test
    public void testCase1(){
        String input = "()";
        Assert.assertTrue(validParentheses.isValid(input));
    }

    @Test
    public void testCase2(){
        String input = "()[]{}";
        Assert.assertTrue(validParentheses.isValid(input));
    }

    @Test
    public void testCase3(){
        String input = "(]";
        Assert.assertFalse(validParentheses.isValid(input));
    }
    @Test
    public void testCase4(){
        String input = "]";
        Assert.assertFalse(validParentheses.isValid(input));
    }
}
