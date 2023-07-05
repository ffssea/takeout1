import org.junit.jupiter.api.Test;

public class Test1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int totalLen = nums1.length + nums2.length;
        int m1 = (totalLen + 1) / 2;
        int m2 = (totalLen + 2) / 2;
        int res1 = findKthSmallest(nums1, nums2, 0,0,m1);
        int res2 = findKthSmallest(nums1, nums2, 0,0,m2);
        return (res1-res2) / 2.0 + res2;
    }

    public int findKthSmallest(int[] nums1, int[] nums2, int w1, int w2, int k){

        if(w1 >= nums1.length) return nums2[w2+k-1];
        if(w2 >= nums2.length) return nums1[w1+k-1];

        if(k==1) return Math.min(nums1[w1], nums2[w2]);

        int mid1 = (w1+k/2-1 < nums1.length) ? nums1[w1+k/2-1] : Integer.MAX_VALUE;
        int mid2 = (w2+k/2-1 < nums2.length) ? nums2[w2+k/2-1] : Integer.MAX_VALUE;

        if(mid1 < mid2) {
            return findKthSmallest(nums1, nums2, w1+k/2, w2, k-k/2);
        } else {
            return findKthSmallest(nums1, nums2, w1, w2+k/2, k-k/2);
        }

    }

    @Test
    public void testFindMedianSortedArrays() {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
