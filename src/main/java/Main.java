import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        Solution.merge(nums1, m, nums2, n);
    }

    public static class Solution {

        public static void merge(int[] nums1, int m, int[] nums2, int n) {
//            List<Integer> list = new ArrayList<>();
//            for (int i :nums1) {
//                list.add(i);
//            }
//            for (int i : nums2) {
//                list.add(i);
//            }
//           Collections.sort(list);

            for (int i = 0; i < n; i++) {
                nums1[m + i] = nums2[i];
            }
            Arrays.sort(nums1);
        }
    }
}
