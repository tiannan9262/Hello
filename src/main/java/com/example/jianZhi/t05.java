package com.example.jianZhi;

public class t05 {


    public static void main(String[] args) {
        SolutionT5 solutionT5 = new SolutionT5();
        String s = solutionT5.replaceSpace("We are happy");
        System.out.println(s);
    }
}

// 题目描述
// 将String中的空格转换成  "%20"
// 解题：新建stringBuffer，每次append string中的值，遇到空格则添加"%20"

class SolutionT5 {
    public String replaceSpace(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < s.length();i ++) {
            if (s.charAt(i) == ' ') {
                sb = sb.append("%20");
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        return String.valueOf(sb);
    }
}