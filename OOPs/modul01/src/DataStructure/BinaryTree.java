package DataStructure;

class BinaryTree {

    // Node class to represent each tree node
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    Node root;

    // Constructor
    BinaryTree() {
        root = null;
    }

    // Manually add nodes - just for example purpose
    // Here we simply assign left and right children manually
    public void buildSampleTree() {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
    }

    // Preorder traversal: Root -> Left -> Right
    public void preorder(Node node) {
        if (node == null) return;

        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    // Inorder traversal: Left -> Root -> Right
    public void inorder(Node node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    // Postorder traversal: Left -> Right -> Root
    public void postorder(Node node) {
        if (node == null) return;

        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }

    // Calculate size (total nodes) of the tree
    public int size(Node node) {
        if (node == null) return 0;
        return 1 + size(node.left) + size(node.right);
    }

    // Calculate the height of the tree (max depth)
    public int height(Node node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // Level order traversal (Breadth-first)
    // It is all about Horizontal nodes left to right in sequentially
    public void levelOrder() {
        if (root == null) return;

        java.util.Queue<Node> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + " ");

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Build a simple tree
        tree.buildSampleTree();

        System.out.print("Preorder traversal: ");
        tree.preorder(tree.root);
        System.out.println();

        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
        System.out.println();

        System.out.print("Postorder traversal: ");
        tree.postorder(tree.root);
        System.out.println();

        System.out.print("Level order traversal: ");
        tree.levelOrder();
        System.out.println();

        System.out.println("Size of the tree: " + tree.size(tree.root));
        System.out.println("Height of the tree: " + tree.height(tree.root));
    }
}
