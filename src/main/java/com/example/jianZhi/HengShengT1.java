package com.example.jianZhi;


import java.util.ArrayList;
import java.util.List;

// 编写一个函数，输入参数为三个：主字符串，子字符串，分隔符(例如：主字符串:1,bv,443s,9s9s  子字符串：9s9s  分隔符: ，)。
// 要求在不用类似strstr(Java中的substring函数)，strtok(Java中的StringToken类)等函数的前提下(遍历字符串来实现)，
// 实现判断子串在住串的存在性。
public class HengShengT1 {

    private static boolean isStringExsits(String mainStr,String subStr,char spl) {
        char [] ch =mainStr.toCharArray();                               // 将mainStr转成字符数组
        List<String> list = new ArrayList<>();                           // 新建ArrayList存放子串
        StringBuilder newStr= new StringBuilder();                       // 新建StringBuilder

        // 取出mainStr中的所有子串
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]!=spl){
                newStr.append(ch[i]);
            }else {
                list.add(newStr.toString());
                newStr = new StringBuilder();
            }
            if (i==ch.length-1){
                list.add(newStr.toString());
                newStr = new StringBuilder();
            }
        }

        // 比较subStr和List中的所有字串
        for (String str : list) {
            if (str.equals(subStr)){
                return true;
            }
        }
        return false;
    }
}
