package main.java;

import java.util.Arrays;

/**
 * @author Admin
 * @PackageName java
 * @ClassName algorithm_demo
 * @Description
 * @create 2022-03-14 11:54
 */

public class SortAlgorithm {
    public static void main(String[] args) {
        int[] arrays = {10, 31, 32, 51, 52, 87, 14, 16};
        mergeSort(arrays, 0, arrays.length - 1);
        System.out.println(Arrays.toString(arrays));
    }

    public static void mergeSort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        int m = (l + r) / 2;
        mergeSort(nums, l, m);
        mergeSort(nums, m + 1, r);
        int[] tmp = new int[r - l + 1];
        if (r + 1 - l >= 0) {
            System.arraycopy(nums, l, tmp, l - l, r + 1 - l);
        }
        int i = 0, j = m - l + 1;
        for (int k = l; k <= r; k++) {
            if (i == m - l + 1) {
                nums[k] = tmp[j++];
            } else if (j == r - l + 1 || tmp[i] <= tmp[j]) {
                nums[k] = tmp[i++];
            } else {
                nums[k] = tmp[j++];
            }
        }
    }

}
