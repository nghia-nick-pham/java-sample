package a_inteview;


import java.util.ArrayList;
import java.util.List;

public class TestForZ {

    public static void main(String[] args) {

//        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        TreeNode root = null;
        TestForZ testForZ = new TestForZ();
        System.out.println(testForZ.inorderTraversal(root));

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) return new ArrayList<>();
        return recursion(root, new ArrayList<>());
    }

    private List<Integer> recursion(TreeNode root,  List<Integer> currentList) { //currentList is for a mutable list.
        List<Integer> result = new ArrayList<>();
        //base case: tree is empty
        if( root == null ){
            return null;
        }

        if (root.left != null){
            recursion(root.left, currentList);
        }
        currentList.add(root.val);
        if (root.right != null){
            recursion(root.right, currentList);
        }
        result = currentList;
        return result;
    }

}
