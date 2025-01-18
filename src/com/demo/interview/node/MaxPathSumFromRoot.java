package com.demo.interview.node;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}

public class MaxPathSumFromRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TreeNode t = new TreeNode(1, new TreeNode(2), new TreeNode(3));
		TreeNode rt = new TreeNode(20, new TreeNode(15), new TreeNode(7));
		TreeNode t = new TreeNode(-10, new TreeNode(9), rt);
		System.out.println(maxPathSum(t));
	}

	public static int maxPathSum(TreeNode root) {
        int sum =root.val;
        sum = maxSum(root, sum);
        return sum;
    }
	
	private static int maxSum(TreeNode node, int sum) {
		int leftSum = sum;
		if (node.left != null) {
			leftSum = maxSum(node.left, leftSum+=node.left.val);
		} 
		int rightSum = sum;
		if (node.right != null) {
			rightSum = maxSum(node.right, rightSum+=node.right.val);
		}
		return Math.max(leftSum, rightSum);
	}
}
