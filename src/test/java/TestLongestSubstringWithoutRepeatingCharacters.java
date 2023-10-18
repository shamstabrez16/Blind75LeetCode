import String.LongestSubstringWithoutRepeatingCharacters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLongestSubstringWithoutRepeatingCharacters {

    private LongestSubstringWithoutRepeatingCharacters repeatingCharacters;

    @Before
    public void setUp(){
        repeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    }

    @Test
    public void testCase1()
    {
        String  s = "abcabcbb";
        int expectedoutput = 3;
        Assert.assertEquals(expectedoutput,repeatingCharacters.lengthOfLongestSubstring(s));
    }
    @Test
    public void testCase2()
    {
        String  s = "bbbbb";
        int expectedoutput = 1;
        Assert.assertEquals(expectedoutput,repeatingCharacters.lengthOfLongestSubstring(s));
    }
    @Test
    public void testCase3()
    {
        String  s = "pwwkew";
        int expectedoutput = 3;
        Assert.assertEquals(expectedoutput,repeatingCharacters.lengthOfLongestSubstring(s));
    }
    //aab
    @Test
    public void testCase4()
    {
        String  s = "aab";
        int expectedoutput = 2;
        Assert.assertEquals(expectedoutput,repeatingCharacters.lengthOfLongestSubstring(s));
    }
    //dvdf
    @Test
    public void testCase5()
    {
        String  s = "dvdf";
        int expectedoutput = 3;
        Assert.assertEquals(expectedoutput,repeatingCharacters.lengthOfLongestSubstring(s));
    }
}
