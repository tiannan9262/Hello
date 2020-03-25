package com.example.jianZhi;


import java.util.Stack;

public class t06 {
    public static void main(String[] args) {
        SolutionT6 solutionT6 = new SolutionT6();
    }
}

class Node {
    int val;
    Node next;
    Node(int x) { val = x; }
}
// 反向打印链表
/**
 * Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
 */
class SolutionT6 {
    public int[] reversePrint(Node head) {
        Stack<Integer> stack = new Stack<>();             // 新建栈
        Node temp = head;                             // 链表首节点
        while (temp != null){                             //
            stack.push(temp.val);
            temp = temp.next;
        }
        int size = stack.size();
        int[] array = new int[size];
        for (int i = 0; i < size; i ++){
            array[i] = stack.pop();
        }
        return array;
    }
}