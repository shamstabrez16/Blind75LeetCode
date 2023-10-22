import String.GroupAnagrams;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestGroupAnagrams {
    private GroupAnagrams groupAnagrams;

    @Before
    public void setUp(){
        groupAnagrams = new GroupAnagrams();
    }

    @Test
    public void testCase1(){
        List<List<String>> expected = new ArrayList<>();

        List<String> list1 = new ArrayList<>();
        list1.add("bat");
        expected.add(list1);
        List<String> list2 = new ArrayList<>();
        list2.add("nat");
        list2.add("tan");
        expected.add(list2);
        List<String> list3 = new ArrayList<>();
        list3.add("ate");
        list3.add("eat");
        list3.add("tea");
        expected.add(list3);
        String[] trs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> actual = groupAnagrams.groupAnagrams(trs);
        // Sort the lists within the actual and expected results
        for (List<String> list : actual) {
            Collections.sort(list);
        }
        for (List<String> list : expected) {
            Collections.sort(list);
        }

        // Sort the lists of lists for consistent order
        actual.sort(Comparator.comparing(Object::toString));
        expected.sort(Comparator.comparing(Object::toString));

        // Assert that the actual result matches the expected result
        Assert.assertEquals(expected, actual);

    }

}
