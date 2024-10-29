package leetcode_75.tree.construct_binary_tree_preorder_inorder;


import leetcode_75.tree.TreeNode;

public class ConstructBinaryTree_Optimal {

        int prePos = 0, inPos = 0;
        public TreeNode buildTree(int[] preOrder, int[] inOrder) {
            return buildTree(preOrder, inOrder, Integer.MIN_VALUE);
        }

        private TreeNode buildTree(int[] preOrder, int[] inOrder, int val) {
            if(prePos >= preOrder.length || inPos >= inOrder.length) {
                return null;
            }
            TreeNode node = new TreeNode(preOrder[prePos]);

            prePos++;
            if(preOrder[prePos-1] != inOrder[inPos]) {
                node.left = buildTree(preOrder, inOrder, node.val);
            }

            inPos++;
            if(inPos < inOrder.length && inOrder[inPos] != val) {
                node.right = buildTree(preOrder, inOrder, val);
            }

            return node;
        }
    }
