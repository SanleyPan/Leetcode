package array;

public class FindMedianSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int sumLength = nums1.length + nums2.length;
        int midIndex = sumLength/2;
        if(sumLength % 2 == 0){
            return (getKElement(nums1,nums2,midIndex+1)+ getKElement(nums1,nums2,midIndex))/2;
        }else{
            return getKElement(nums1,nums2,midIndex+1);
        }
    }

    public static double getKElement(int[] nums1, int[] nums2,int k) {
        int index1 = 0;
        int index2 = 0;
        while (true) {
            if (index1 == nums1.length) {
                return nums2[index2 + k - 1];
            }
            if (index2 == nums2.length) {
                return nums1[index1 + k - 1];
            }
            if (k == 1) {
                return Math.min(nums1[index1], nums2[index2]);
            }

            int half = k / 2;
            int newIndex1 = Math.min(index1 + half, nums1.length) - 1;
            int newIndex2 = Math.min(index2 + half, nums2.length) - 1;

            if (nums1[newIndex1] <= nums2[newIndex2]) {
                k -= newIndex1 - index1 + 1;
                index1 = newIndex1 + 1;
            } else {
                k -= newIndex2 - index2 + 1;
                index2 = newIndex2 + 1;
            }

        }
    }

    //The most simple answer is merge two array and find the middle index of result array , but we dont need to acturally merge two arrays,simu
}
