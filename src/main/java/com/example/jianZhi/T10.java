package com.example.jianZhi;

public class T10 {

}
class Solution10 {
    public int fib1(int n) {

        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else if(fib1(n-1) + fib1(n-2) >= 1000000008){
            return 1;
        }
        else{
            return fib1(n-1)+fib1(n-2);
        }
    }
    // 尾递归，f(n+1) = f(n) + f(n-1); 每次循环计算f(n+1)，两个变量分别保存f(n)和f(n-1)减少运算次数
    public int fib(int n){
        int x = 0;
        int next = 1;
        int nextPre = 0;
        for (int i = 0; i < n;i ++){
            nextPre = (x+next) % 1000000007;
            x = next;
            next = nextPre;
        }
        return x;
    }
}