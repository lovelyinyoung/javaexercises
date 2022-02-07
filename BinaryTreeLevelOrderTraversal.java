class BinaryTreeLevelOrderTraversal {
    Node root;
 
    public BinaryTreeLevelOrderTraversal() { 
        root = null; 
    }
 
    public void printLevelOrder() {
        int h = getHeight(root);
        for (int i = 1; i <= h; i++) {
            printCurrentLevel(root, i);
        }
    }
 
    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        } else {
            /* compute  height of each subtree */
            int lheight = getHeight(node.left);
            int rheight = getHeight(node.right);
 
            /* use the larger one */
            if (lheight > rheight) {
                return (lheight + 1);
            } else {
                return (rheight + 1);
            }
        }
    }
 
    private void printCurrentLevel(Node node, int level) {
        if (node == null) {
            return;
        }

        if (level == 1) {
            System.out.print(node.data + " ");
        } else if (level > 1) {
            printCurrentLevel(node.left, level - 1);
            printCurrentLevel(node.right, level - 1);
        }
    }
 
    public static void main(String args[]) {
        BinaryTreeLevelOrderTraversal tree = new BinaryTreeLevelOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
       System.out.println("Level order traversal of binary tree is ");
       tree.printLevelOrder();
    }

    static class Node {
        int data;
        Node left, right;
        
        public Node(int item) {
            data = item;
            left = right = null;
        }
    }
}