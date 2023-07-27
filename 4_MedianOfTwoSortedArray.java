import java.util.Arrays;

public class MedianOfTwoSortedArray {
    
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};

        double ans = medianOfTwoSortedArray(nums1, nums2);
        System.out.println(ans);
    }

    private static double medianOfTwoSortedArray(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        double ans = 0;
        
        for(int i = 0; i < nums1.length; i++){
            merged[i] = nums1[i];
        }

        for(int i = 0; i < nums2.length; i++) {
            merged[nums1.length + i] = nums2[i]; 
        }

        Arrays.sort(merged);

        if(merged.length % 2 == 0){
            ans = merged[(merged.length / 2) - 1] + merged[(merged.length / 2)];
            ans /= 2;
        } else {
            ans = merged[merged.length / 2];
        }
        return ans;
    }
}
