package dsa;

public class ValidateBST {
	private static TreeNode prev = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Example tree:
        //       4
        //      / \
        //     2   5
        //    / \
        //   1   3
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        boolean isBST = isValidBST(root);
        if (isBST) {
            System.out.println("The tree is a valid BST.");
        } else {
            System.out.println("The tree is not a valid BST.");
        }

	}

	private static boolean isValidBST(TreeNode root) {
		// TODO Auto-generated method stub
		if(root == null) {
			return true;
		}
		
		if(!isValidBST(root.left)) {
			return false;
		}
		
		if(prev!= null && prev.data >= root.data) {
			return false;
			
		}
		
		prev = root;
		return isValidBST(root.right);
	}

}
