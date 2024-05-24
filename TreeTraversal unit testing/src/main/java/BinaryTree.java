import java.util.Stack;

public class BinaryTree {

    // Method to perform inorder traversal using loop
    public String inorderTraversal(TreeNode root) {
        if (root == null)
            return "Tree is empty";

        StringBuilder result = new StringBuilder();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            // Reach the leftmost node of the current node
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            // Node at the top of the stack is the leftmost node
            curr = stack.pop();
            result.append(curr.val).append(" ");

            // Move to the right subtree
            curr = curr.right;
        }

        return "Tree traversed successfully: " + result.toString();
    }
}