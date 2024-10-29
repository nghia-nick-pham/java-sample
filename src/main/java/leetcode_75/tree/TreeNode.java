package leetcode_75.tree;

public class TreeNode {

    public int val;

    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val){
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public void setLeft (TreeNode treeNode){
        this.left = treeNode;
    }
    public void setRight (TreeNode treeNode){
        this.right = treeNode;
    }
}
