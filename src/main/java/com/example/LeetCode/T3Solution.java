package com.example.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class T3Solution {
    public static void main(String[] args) {
        T3Solution t = new T3Solution();
        System.out.println(t.solution("abcdefa"));
    }

    //滑动窗口概念
    //i和j都在0-s.length()范围内，
    // 初始化i=j=0;[i,j)形成一个窗口，j不断增加，如果新的s[j]和窗口数值没有重复的,就扩大窗口增加s[j]，这样ans=j-i也增加了，
    //当s[j]出现重复时，从s[i]开始remove，将序号考前的元素移除窗口，直到s[j]与窗口无重复，即set.contains(s[j])为false。
public int solution(String s){
        Set<Character> set = new HashSet<>();
        int ans = 0;
        int i = 0;
        int j = 0;
        while (i<s.length()&&j<s.length())
        {
            if (!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j++));
                ans = Math.max(ans,j-i);
            }
            else
            {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

}
