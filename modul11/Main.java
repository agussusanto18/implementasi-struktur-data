import java.security.SecureRandom;

public class Main {
    public static void main(String[] args) {
        Tree<Character> tree = new Tree<>();
        tree.insertNode('F');
        tree.insertNode('E');
        tree.insertNode('H');
        tree.insertNode('D');
        tree.insertNode('G');
        tree.insertNode('C');
        tree.insertNode('B');
        tree.insertNode('H');
        tree.insertNode('K');
        tree.insertNode('J');

        // Hasil Pencarian

        tree.searchBST('K');
        tree.searchBST('A');
    }
}