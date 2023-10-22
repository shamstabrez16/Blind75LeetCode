import String.ValidAnagram;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestValidAnagrams {

    private ValidAnagram  validAnagram;

    @Before
    public void setUp() {
        validAnagram = new ValidAnagram();
    }
    @Test
    public void testCase1(){
        String  s = "anagram", t = "nagaram";
        Assert.assertTrue(validAnagram.isAnagram(s,t));
    }
    @Test
    public void testCase2(){
        String  s = "rat", t = "car";
        Assert.assertFalse(validAnagram.isAnagram(s,t));
    }
    @Test
    public void testCase3(){
        String  s = "nl", t = "cx";
        Assert.assertFalse(validAnagram.isAnagram(s,t));
    }
}
