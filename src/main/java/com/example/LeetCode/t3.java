package com.example.LeetCode;

/*给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
例：
输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
*/

import java.util.HashSet;
import java.util.Set;

public class t3
{
    public static void main(String[] args)
    {
        t3 t = new t3();
        System.out.println(t.lengthOfLongestSubstring("abcdefa"));
    }

    //时间复杂度O(n^3)
    public int lengthOfLongestSubstring(String s)
    {
        int n = s.length();
        int ans = 0;
        for (int i = 0;i<n;i++)
        {
            for (int j = i+1;j<n;j++)
            {
                if (allUnique(s,i,j))
                {
                    ans = Math.max(ans,j-i);
                }
            }
        }
        return ans;
    }

    public boolean allUnique(String s ,int i ,int j)
    {
        Set<Character> set = new HashSet<>();
        for (;i <j;i++)
        {
            Character ch = s.charAt(i);
            if (set.contains(ch))
            {
                return false;
            }
            set.add(ch);
        }
        return true;
    }
}
