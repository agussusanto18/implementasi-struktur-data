public class BTNode2<T> {
    BTNode2 left, right;
    T data;

    public BTNode2() {
        left = null;
        right = null;
        data = null;
    }

    public BTNode2(T item) {
        left = null;
        right = null;
        data = item;
    }

    public BTNode2 getLeft() {
        return left;
    }

    public void setLeft(BTNode2 left) {
        this.left = left;
    }

    public BTNode2 getRight() {
        return right;
    }

    public void setRight(BTNode2 right) {
        this.right = right;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
