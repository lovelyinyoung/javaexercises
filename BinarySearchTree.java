class BinarySearchTree {
    BinarySearchTree left, right;
    int data;

    public BinarySearchTree (int data) {
        this.data = data;
    }
    
    public void insert (int value) {
        if (value < data) {
            if (left == null) {
                left = new BinarySearchTree(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new BinarySearchTree(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains (int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }

    public static void main (String [] args) {
     BinarySearchTree tree = new BinarySearchTree(8);
        
     tree.insert(8);
     tree.insert(5);
     tree.insert(2);
     tree.insert(3);

     tree.contains(10); // false
     tree.contains(15); // true
        
     tree.printInOrder();

    }
}