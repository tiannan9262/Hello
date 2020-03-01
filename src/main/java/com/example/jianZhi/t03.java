package com.example.jianZhi;

import java.util.HashSet;
import java.util.Set;

public class t03 {
    public static void main(String[] args) {
        SolutionT3 solutionT3 = new SolutionT3();
        int[] a = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(solutionT3.findRepeatNumber(a));
    }
}

class SolutionT3 {
    public int findRepeatNumber(int[] nums) {
        for (int k = 1;k < nums.length;k++){
            if (isRepeat(nums,k)){
                return nums[k];
            }
        }
        return 0;
    }

    private boolean isRepeat(int[] nums, int k) {
        for (int i = 0; i < k; i ++){
            if (nums[i] == nums[k]){
                return true;
            }
        }
        return false;
    }
}

class SolutionT3v1 {
    public int findRepeatNumber(int[] nums) {
        int temp;
        for(int i=0;i<nums.length;i++){
            while (nums[i]!=i){
                if(nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
        }
        return -1;
    }
}

//作者：derrick_sun
//        链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/solution/yuan-di-zhi-huan-shi-jian-kong-jian-100-by-derrick/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

class SolutionT3v2 {                                      // 官方
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int repeat = -1;
        for (int num : nums) {
            if (!set.add(num)) {
                repeat = num;
                break;
            }
        }
        return repeat;
    }
}

//作者：LeetCode-Solution
//        链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/solution/mian-shi-ti-03-shu-zu-zhong-zhong-fu-de-shu-zi-b-4/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。