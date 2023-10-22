import Array.ThreeSum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestThreeSum {

    private ThreeSum threeSum;

    @Before
    public void setUp() {
        threeSum = new ThreeSum();
    }

    @Test
    public void testCase1() {
        int[] input = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expectedOutput = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(-1);
        list1.add(-1);
        list1.add(2);
        expectedOutput.add(list1);
        List<Integer> list2 = new ArrayList<>();
        list2.add(-1);
        list2.add(0);
        list2.add(1);
        expectedOutput.add(list2);
        List<List<Integer>> actual = threeSum.threeSum(input);
        for (int i = 0; i < expectedOutput.size(); i++) {
            List<Integer> expectedGroup = expectedOutput.get(i);
            List<Integer> actualGroup = actual.get(i);
            Assert.assertEquals(expectedGroup.get(0), actualGroup.get(0));
            Assert.assertEquals(expectedGroup.get(1), actualGroup.get(1));
            Assert.assertEquals(expectedGroup.get(2), actualGroup.get(2));
        }

    }

    @Test
    public void testCase3() {
        int[] input = {0, 1, 1};
        List<List<Integer>> actual = threeSum.threeSum(input);
        Assert.assertEquals(0, actual.size());
    }

    @Test
    public void testCase2() {
        int[] input = {0, 0, 0};
        List<List<Integer>> expectedOutput = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(0);
        list1.add(0);
        expectedOutput.add(list1);
        List<List<Integer>> actual = threeSum.threeSum(input);
        for (int i = 0; i < expectedOutput.size(); i++) {
            List<Integer> expectedGroup = expectedOutput.get(i);
            List<Integer> actualGroup = actual.get(i);
            Assert.assertEquals(expectedGroup.get(0), actualGroup.get(0));
            Assert.assertEquals(expectedGroup.get(1), actualGroup.get(1));
            Assert.assertEquals(expectedGroup.get(2), actualGroup.get(2));
        }
    }
}
