package second;

import java.util.Arrays;

public class Inclass {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }
}

 