import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class SolutionUnitTests {

    @Test
    public void testCommonTestCases() {
        OneWayArrayList<Integer> data = new OneWayArrayList(new Integer[] { 0, 1, 2, 3, 4, 5 });
        LinkedList[] expectedResult = new LinkedList[] {
                new LinkedList<>(Arrays.asList(5, 3, 1)),
                new LinkedList<>(Arrays.asList(4, 2, 0))
        };
        LinkedList[] realResult = Solution.filterToOddNEven(data.head());
        Assert.assertEquals(realResult, expectedResult);

        OneWayArrayList<Integer> data2 = new OneWayArrayList(new Integer[] { -1, 0, 1, 2, 3, 4, 5, 5, 0 });
        LinkedList[] expectedResult2 = new LinkedList[] {
                new LinkedList<>(Arrays.asList(5, 5, 3, 1, -1)),
                new LinkedList<>(Arrays.asList(0, 4, 2, 0))
        };
        LinkedList[] realResult2 = Solution.filterToOddNEven(data2.head());
        Assert.assertEquals(realResult2, expectedResult2);
    }

    @Test
    public void testEdgeTestCases() {
        OneWayArrayList<Integer> data = new OneWayArrayList(new Integer[] { });
        LinkedList[] expectedResult = new LinkedList[] {
                new LinkedList<>(),
                new LinkedList<>()
        };
        LinkedList[] realResult = Solution.filterToOddNEven(data.head());
        Assert.assertEquals(realResult, expectedResult);

        OneWayArrayList<Integer> data2 = new OneWayArrayList(new Integer[] { -1, 1, 3, 5, 5 });
        LinkedList[] expectedResult2 = new LinkedList[] {
                new LinkedList<>(Arrays.asList(5, 5, 3, 1, -1)),
                new LinkedList<>()
        };
        LinkedList[] realResult2 = Solution.filterToOddNEven(data2.head());
        Assert.assertEquals(realResult2, expectedResult2);

        OneWayArrayList<Integer> data3 = new OneWayArrayList(new Integer[] { 0, 2, 4, 0 });
        LinkedList[] expectedResult3 = new LinkedList[] {
                new LinkedList<>(),
                new LinkedList<>(Arrays.asList(0, 4, 2, 0))
        };
        LinkedList[] realResult3 = Solution.filterToOddNEven(data3.head());
        Assert.assertEquals(realResult3, expectedResult3);

        OneWayArrayList<Integer> data4 = new OneWayArrayList(new Integer[] { 1, 1, 1, 1 });
        LinkedList[] expectedResult4 = new LinkedList[] {
                new LinkedList<>(Arrays.asList(1, 1, 1, 1)),
                new LinkedList<>()
        };
        LinkedList[] realResult4 = Solution.filterToOddNEven(data4.head());
        Assert.assertEquals(realResult4, expectedResult4);

        OneWayArrayList<Integer> data5 = new OneWayArrayList(new Integer[] { 2, 2, 2 });
        LinkedList[] expectedResult5 = new LinkedList[] {
                new LinkedList<>(),
                new LinkedList<>(Arrays.asList(2, 2, 2))
        };
        LinkedList[] realResult5 = Solution.filterToOddNEven(data5.head());
        Assert.assertEquals(realResult5, expectedResult5);
    }

}
