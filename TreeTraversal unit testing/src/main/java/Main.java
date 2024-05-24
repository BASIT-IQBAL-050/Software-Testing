
public class Main {
    public static void main(String[] args) {
        /* Constructed binary tree is
                   1
                 /   \
                2     3
               / \
              4   5
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BinaryTree tree = new BinaryTree();
        System.out.println("Inorder traversal of binary tree using loop:");
        System.out.println(tree.inorderTraversal(root));
    }
}