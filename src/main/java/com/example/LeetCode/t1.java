package com.example.LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class t1 {
    public static void main(String[] args) {
        t1 t = new t1();
        int[] b = {3,2,4};

        System.out.println(Arrays.toString(t.twoSum(b,6)));
    }
    //时间复杂度O(n^2),空间复杂度O(1)
    int[] twoSum(int[] nums, int target) {
        for (int i = 0;i<nums.length;i++)
        {
            for (int j = i+1;j<nums.length;j++)
            {
                if (nums[j]==target-nums[i])
                {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");

    }
}

class t1solutionHashMap{
    int[] twosum(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i =0;i <nums.length;i++)
        {
            map.put(nums[i],i);
        }
        for (int i = 0;i<nums.length;i++)
        {
            int complement = target-nums[i];
            if (map.containsKey(complement)&&map.get(complement) !=i)
            {
                return new int[]{i,map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

//最优解，一遍Hashmap，每次将元素插入map之前检查map是否存在key值等于target-元素的量
//时间复杂度O(n),空间复杂度O(n)
class t1solutionHashMap1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}

