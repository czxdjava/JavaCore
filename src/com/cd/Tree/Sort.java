package com.cd.Tree;

/**
 * @author Chen zhi xiang
 * @date 2020/5/19 21:27
 */
public class Sort {
    public static void main(String[] args) {
        sort1(init());
    }
    public static TreeNode init(){
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(5);
        TreeNode treeNode2 = new TreeNode(4);
        TreeNode treeNode3 = new TreeNode(13);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        treeNode1.left =treeNode3;
        return treeNode;
    }
    public static void sort(TreeNode treeNode){
        if (treeNode!=null) {
            System.out.println(treeNode.val);
            sort(treeNode.left);
            sort(treeNode.right);
        }
    }
    public static void sort1(TreeNode treeNode){
        if (treeNode!=null){
            sort1(treeNode.left);
            System.out.println(treeNode.val);
            sort1(treeNode.right);
        }
    }
}
