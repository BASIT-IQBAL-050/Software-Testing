import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBinaryTree {
    @Test
    public void inorderTraversal_will_return_tree_is_empty_for_empty_root(){
        BinaryTree bt = new BinaryTree();
        TreeNode root = new TreeNode(1);
        root = null;
        String expectedOutput = "Tree is empty";
        String output = bt.inorderTraversal(root);
        Assertions.assertEquals(expectedOutput,output);

    }
    @Test
    public void inorderTraversal_will_return_tree(){
        BinaryTree bt = new BinaryTree();
        TreeNode root = new TreeNode(1);
        String actualOutput = bt.inorderTraversal(root);
        String expectedOutput = "Tree traversed successfully: "+ "1 ";
        Assertions.assertEquals(expectedOutput,actualOutput);

    }
}
