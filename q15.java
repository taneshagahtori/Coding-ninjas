public class Solution {
    public static boolean searchInBST(BinaryTreeNode root, int x) {
        // Write your code here.
        if(root==null) return false;
        if(root.data==x) return true;
        if(root.data<x) return searchInBST(root.right,x);
        return searchInBST(root.left,x);
    }
}