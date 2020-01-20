package com.example.LeetCode;

public class t4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s = (nums1.length+nums2.length);
        int i = 0;
        int j = 0;
        int k = 0;
        if (s%2==0)
        {
            s=s/2+1;
            int[] a = new int[s];
            while (k<s)
            {
                if (i<nums1.length&&nums1[i] <= nums2[j])
                {
                    a[k++]=nums1[i++];
                }
                else if (j<nums2.length)
                {
                    a[k++]=nums2[j++];
                }
            }
            return (float)(a[s-2]+a[s-1])/2;
        }
        else
        {
            s=(s+1)/2;
            int[] a = new int[s];
            while (k<s)
            {
                if (i<nums1.length&&nums1[i]<nums2[j])
                {
                    a[k++]=nums1[i++];
                }
                else if (j<nums2.length)
                {
                    a[k++]=nums2[j++];
                }
            }
            return (float)a[s-1];
        }

    }

    public static void main(String[] args) {
        t4 t = new t4();
        int[] a = {2};
        int[] b = {};
        System.out.println(t.findMedianSortedArrays(a,b));
    }
}
