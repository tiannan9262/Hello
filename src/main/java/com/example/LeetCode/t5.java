package com.example.LeetCode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class t5 {
    public static void main(String[] args) {
    }
    public String longestPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        int j = 1;
        for (int i = 0;i<s.length();i++)
        {
            if (!huiwen(s)) {
                stringBuilder.append(s.charAt(j++));
            }
            else
            {
                stringBuilder.deleteCharAt(i);
            }


        }
        return "hh";

    }

    public boolean huiwen(String s){
        int n = s.length();
        int k = 0;
        for (int i = 1;i<=n/2;i++)
        {
            if (s.charAt(i)==s.charAt(n-i+1))
            {
                k++;
            }
        }
        return k == n / 2;
    }
}
