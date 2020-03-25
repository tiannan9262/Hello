package com.example.jianZhi;

import java.io.File;
import java.util.HashMap;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        String mainString = "1,bv,443s,9s9s";
        String subString = "9s9s";
        char c = ',';
        if (isSubStringExist(mainString,subString,c)){
            System.out.println("true");
        }
        else System.out.println("false");
    }

    private static int[] merge(int[] arr1, int[] arr2){
        int size1=arr1.length;
        int size2=arr2.length;
        int[] array=new int[size1+size2];
        int i=0;
        int j=0;
        int t=0;
        while(i < size1 && j < size2){
            if(arr1[i]<=arr2[j]){
                array[t++] = arr1[i++];
            }
            else
                array[t++] = arr2[j++];
        }
        while(i < size1){
            array[t++] = arr1[i++];
        }
        while(j < size2){
            array[t++] = arr2[j++];
        }
        return array;
    }

    public static String receiver(String s){
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        int i = 0;
        while (i<s.length()){
            if (s.charAt(i) != ' '){
                sb.append(s.charAt(i++));
            }
            else {
                stack.push(sb.toString());
                sb.delete(0,sb.length());
                i++;
            }
        }
        stack.push(sb.toString());
        sb.setLength(0);
        while (!stack.empty()){
            sb.append(stack.pop());
            sb.append(' ');
        }
        return sb.toString();
    }

    private static boolean isSubStringExist(String mainString, String subString, char c){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mainString.length();i ++){
            if (mainString.charAt(i) == c){
                if (subString.equals(sb.toString())){
                    return true;
                }
                sb.setLength(0);
            }
            else {
                sb.append(mainString.charAt(i));
            }
            if (subString.equals(sb.toString())){
                return true;
            }

        }
        return false;
    }

    private static void wordCounts(String pathName){

        File file = new File(pathName);


        HashMap hashMap = new HashMap();
        String s = "sss";
        if (!hashMap.containsKey(s)){
            hashMap.put(s,1);
        }
        else {
            hashMap.put(s,(int)hashMap.get(s)+1);
        }
        System.out.println(hashMap);

    }
}
