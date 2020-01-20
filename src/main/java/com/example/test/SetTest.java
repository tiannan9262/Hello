package com.example.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        TreeSet<String> treeSet = new TreeSet<>();

        for (String data : Arrays.asList("g","b","c","d","e","f"))
        {
            hashSet.add(data);
            linkedHashSet.add(data);
            treeSet.add(data);
        }
        System.out.println(hashSet);//不保证有序
        System.out.println(linkedHashSet);  //插入有序，FIFO
        String s = linkedHashSet.toString();
        String s1 = s.replace("[","");
        String s2 = s1.replace(",","");
        String s3 = s2.replace("]","");
        String s4 = s3.replace(" ","");
        System.out.println(s4);
        System.out.println(treeSet);//内部实现排序，如果元素是对象，必须要
    }
}
