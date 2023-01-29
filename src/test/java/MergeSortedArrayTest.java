import junit.framework.TestCase;

import java.util.Arrays;

public class MergeSortedArrayTest extends TestCase {
    public void testProfit1(){
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        Main.Solution.merge(nums1, m, nums2, n);
        int[] expected = {1, 2, 2, 3, 5, 6};
        assertEquals(Arrays.toString(expected), Arrays.toString(nums1));
    }

    public void testProfit2(){
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        Main.Solution.merge(nums1, m, nums2, n);
        int[] expected = {1};
        assertEquals(Arrays.toString(expected), Arrays.toString(nums1));
    }
}
