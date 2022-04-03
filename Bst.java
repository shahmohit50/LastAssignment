/**
 * Bst
 */
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        data = value;
        left = right = null;
    }
}

public class Bst {

    TreeNode root;

    Bst() {
        root = null;
    }

    public static void inorder(TreeNode root1) {
        if (root1 == null) {
            return;
        }
        inorder(root1.left);
        System.out.print(root1.data + " ");
        inorder(root1.right);
    }

    public static void postorder(TreeNode root1){
        if (root1 == null) {
            return;
        }
        postorder(root1.left);
        postorder(root1.right);
        System.out.print(root1.data + " ");
    }
    public static void preorder(TreeNode root1){
        if (root1 == null) {
            return;
        }
        System.out.print(root1.data + " ");
        preorder(root1.left);
        preorder(root1.right);
        
    }
    public static int maxDepth(TreeNode node) {
        if (node == null) {
            return -1;
        }

        int ldepth = maxDepth(node.left);
        int rdepth = maxDepth(node.right);

        if (ldepth > rdepth) {
            return ldepth+1; 
        }else{
            return rdepth+1;
        }
    }

    public static int totalCount(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1+totalCount(node.left)+totalCount(node.right);
    }
    public static int totalSum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return node.data+totalSum(node.left)+totalSum(node.right);
    }
    public static void printLeaf(TreeNode node) {
        if (node.left == null && node.right == null) {
            System.out.print(node.data+" ");
            return;
        }

        printLeaf(node.left);
        printLeaf(node.right);
    }
    public static void main(String[] args) {
        Bst bst = new Bst();
        bst.root = new TreeNode(1);
        bst.root.left = new TreeNode(2);
        bst.root.right = new TreeNode(3);
        bst.root.left.left = new TreeNode(4);
        bst.root.left.right = new TreeNode(5);
        inorder(bst.root);
        System.out.println(" ");
        preorder(bst.root);
        System.out.println(" ");
        postorder(bst.root);
        System.out.println("Max Depth =  "+maxDepth(bst.root));
        System.out.println("Total Count =  "+totalCount(bst.root));
        System.out.println("Total Sum =  "+totalSum(bst.root));
        printLeaf(bst.root);
    }
}