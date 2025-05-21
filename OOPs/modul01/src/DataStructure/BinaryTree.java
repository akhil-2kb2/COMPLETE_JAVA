package DataStructure;

// Node class
class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

// Binary Tree class
public class BinaryTree {
    Node root;

    // Constructor
    public BinaryTree() {
        root = null;
    }

    // Insert a node manually (binary tree, not BST)
    public void insert(int value) {
        root = insertRecursively(root, value);
    }

    // Recursive insert helper (Binary Search Tree logic)
    private Node insertRecursively(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.data) {
            root.left = insertRecursively(root.left, value);
        } else {
            root.right = insertRecursively(root.right, value);
        }

        return root;
    }

    // Inorder traversal (Left, Root, Right)
    public void inorder() {
        System.out.print("Inorder: ");
        inorderTraversal(root);
        System.out.println();
    }

    private void inorderTraversal(Node root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);
        }
    }

    // Preorder traversal (Root, Left, Right)
    public void preorder() {
        System.out.print("Preorder: ");
        preorderTraversal(root);
        System.out.println();
    }

    private void preorderTraversal(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }

    // Postorder traversal (Left, Right, Root)
    public void postorder() {
        System.out.print("Postorder: ");
        postorderTraversal(root);
        System.out.println();
    }

    private void postorderTraversal(Node root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Search a node
    public boolean search(int key) {
        return searchRecursive(root, key);
    }

    private boolean searchRecursive(Node root, int key) {
        if (root == null)
            return false;

        if (root.data == key)
            return true;

        return key < root.data
                ? searchRecursive(root.left, key)
                : searchRecursive(root.right, key);
    }

    // Find height of the tree
    public int height() {
        return heightRecursive(root);
    }

    private int heightRecursive(Node root) {
        if (root == null)
            return 0;

        int leftHeight = heightRecursive(root.left);
        int rightHeight = heightRecursive(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // Main method to test
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        tree.inorder();   // Should print sorted order
        tree.preorder();  // Root first
        tree.postorder(); // Root last

        System.out.println("Search 40: " + tree.search(40)); // true
        System.out.println("Search 90: " + tree.search(90)); // false

        System.out.println("Height of tree: " + tree.height());
    }
}
