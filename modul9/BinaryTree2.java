public class BinaryTree2<T> {
    private BTNode2 root;

    public BinaryTree2() {
        root = null;
    }

    public Boolean isEmpty() {
        return root == null;
    }

    public void insert(T data) {
        root = insert(root, data);
    }

    public BTNode2 insert(BTNode2 node, T data) {
        if (node == null)
            node = new BTNode2(data);
        else {
            if (node.getLeft() == null)
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }

    public int countNodes() {
        return countNodes(root);
    }

    public int countNodes(BTNode2 r) {
        if (r == null)
            return 0;
        else {
            int i = 1;
            i += countNodes(r.getLeft());
            i += countNodes(r.getRight());
            return i;
        }
    }

    public boolean search(T val) {
        return search(root, val);
    }

    public boolean search(BTNode2 r, T val) {
        if (r.getData() == val)
            return true;

        if (r.getLeft() != null)
            if (search(r.getLeft(), val))
                return true;

        if (r.getRight() != null)
            if (search(r.getRight(), val))
                return true;

        return false;
    }

    public void inorder() {
        inorder(root);
    }

    public void inorder(BTNode2 r) {
        if (r != null) {
            inorder(r.getLeft());
            System.out.println(r.getData() + " ");
            inorder(r.getRight());
        }
    }

    public void preorder() {
        preorder(root);
    }

    public void preorder(BTNode2 r) {
        if (r != null) {
            System.out.println(r.getData());
            preorder(r.getLeft());
            preorder(r.getRight());
        }
    }

    public void postorder() {
        postorder(root);
    }

    public void postorder(BTNode2 r) {
        if (r != null) {
            postorder(r.getLeft());
            postorder(r.getRight());
            System.out.println(r.getData() + " ");
        }
    }
}
