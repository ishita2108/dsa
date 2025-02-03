package dsa;

//Question: Find the lowest common ancestor (LCA) in a binary tree.
//Solution: Recursively traverse the tree. If either node is found, return it. If both left and right calls return non-null, this is the LCA.

class TreeNode{
	int data;
	TreeNode left,right;
	
	TreeNode(int data){
		this.data = data;
		left = right = null;
	
}
}

public class BinaryTreeLCA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Example binary tree:
        //         3
        //        / \
        //       5   1
        //      / \ / \
        //     6  2 0  8
        //       / \
        //      7   4
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode node1 = root.left;  // Node 5
        TreeNode node2 = root.left.right.right;  // Node 4

        TreeNode lca = findLCA(root, node1, node2);

        if (lca != null) {
            System.out.println("LCA of " + node1.data + " and " + node2.data + " is: " + lca.data);
        } else {
            System.out.println("LCA not found.");
        }
    }

	private static TreeNode findLCA(TreeNode root, TreeNode node1, TreeNode node2) {
		// TODO Auto-generated method stub
		
		if(root == null || node1 == root || node2 == root) {
			return root;
		}
		else {
			TreeNode leftLCA = findLCA(root.left, node1, node2);
			TreeNode rightLCA = findLCA(root.right, node1, node2);
			// If both leftLCA and rightLCA are not null, root is the LCA
	        if (leftLCA != null && rightLCA != null) {
	            return root;
	        }

	        // Otherwise, return the non-null value from leftLCA or rightLCA
	        return (leftLCA != null) ? leftLCA : rightLCA;
	}
	}
	}

