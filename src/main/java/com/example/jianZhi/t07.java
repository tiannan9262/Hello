package com.example.jianZhi;

public class t07 {
}


class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

//class SolutionT7 {
//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//        TreeNode treeNode = new TreeNode(preorder[0]);
//        int k = 0;
//        for (int i = 0; i < preorder.length; i ++){
//            while (inorder[k] != preorder[i]){
//                treeNode.left.val = inorder[k++];
//                treeNode = treeNode.right;
//            }
//        }
//        return
//    }
//}