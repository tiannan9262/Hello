package com.example.jianZhi;

public class ReverseR {

    public static void main(String[] args) {

    }
    public static Node reverseR(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node res = reverseR(head.next);
        head.next.next = head;
        head.next = null;
        return res;
    }
}
//class ListNode1{
//    int val;
//    ListNode1 next;
//    ListNode1(int x){
//        this.val = x;
//    }
//}