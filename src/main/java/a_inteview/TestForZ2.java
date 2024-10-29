package a_inteview;

public class TestForZ2 {

    public int goodNodes(TreeNode root) {
        return countGoodNodes(root, root.val);  // root.val is the initial maximum value
    }

    public int countGoodNodes(TreeNode root, int max){
        //base case
        if(root==null)
        {
            return 0;
        }

        int currentCount = 0; // 0 is default if root.val < max value
        if (root.val >= max){ // 1 for reverse
            currentCount = 1;
            max = root.val;   // swap with max value
        }
        return currentCount + countGoodNodes(root.left, max) + countGoodNodes(root.right, max);
    }


    public static void main(String[] args) {

        //for testing
        TreeNode left  = new TreeNode(1, new TreeNode(3), null);
        TreeNode right  = new TreeNode(4, new TreeNode(1), new TreeNode(5));
        TreeNode root  = new TreeNode(3,left, right);

        TestForZ2 testForZ2 = new TestForZ2();
        System.out.println(testForZ2.goodNodes(root));
    }
}
