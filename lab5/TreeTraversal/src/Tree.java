
import java.util.Stack;

public class Tree {
    public TreeNode root;
    
    public Tree(){
        this.root=null;
    }  
    public void insert(int element) {
        this.root = insertRecursive(this.root, element);
    }
    private TreeNode insertRecursive(TreeNode root, int element) {
        if (root == null) {
            return new TreeNode(element);
        }
        if (element < root.value) {
            root.left = insertRecursive(root.left, element);
        }
        else {
            root.right = insertRecursive(root.right, element);
        }
        return root;
    }
    public void traverseInOrderIterative() {
        if (this.root == null) {
            System.out.println("Tree is empty");
            return;
        }

        System.out.println("Inorder traversal of the binary search tree (iterative):");
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = this.root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.value + " ");
            current = current.right;
        }

        System.out.println(); 
    }  
}
