import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree2<Integer> bt = new BinaryTree2();

        char ch;

        do {
            System.out.println("\nBinary tree operation\n");
            System.out.println("1. insert");
            System.out.println("2. search");
            System.out.println("3. count nodes");
            System.out.println("4. check empty");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter integer element to insert");
                    bt.insert(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Enter integer element to search");
                    System.out.println("Search result: " + bt.search(scanner.nextInt()));
                    break;
                case 3:
                    System.out.println("Nodes = " + bt.countNodes());
                    break;
                case 4:
                    System.out.println("Empty status = " + bt.isEmpty());
                    break;
                default:
                    System.out.println("Wrong entry \n");
                    break;
            }

            System.out.println("\nPostorder\n");
            bt.postorder();

            System.out.println("\nPreorder\n");
            bt.preorder();

            System.out.println("\nInorder\n");
            bt.inorder();

            System.out.println("\n\nDo you want to continue? (Type y or n)");
            ch = scanner.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }
}
