public class Main {

    public static void main(String[] args) {
        bfs();
        dfs();
    }

    private static void bfs(){
        NodeAdjacent node1 = new NodeAdjacent('A');
        NodeAdjacent node2 = new NodeAdjacent('B');
        NodeAdjacent node3 = new NodeAdjacent('C');
        NodeAdjacent node4 = new NodeAdjacent('D');
        NodeAdjacent node5 = new NodeAdjacent('E');
        NodeAdjacent node6 = new NodeAdjacent('F');
        NodeAdjacent node7 = new NodeAdjacent('G');
        NodeAdjacent node8 = new NodeAdjacent('H');
        NodeAdjacent node9 = new NodeAdjacent('I');
        BFS_ADJACENT.nodes.add(node1);
        BFS_ADJACENT.nodes.add(node2);
        BFS_ADJACENT.nodes.add(node3);
        BFS_ADJACENT.nodes.add(node4);
        BFS_ADJACENT.nodes.add(node5);
        BFS_ADJACENT.nodes.add(node6);
        BFS_ADJACENT.nodes.add(node7);
        BFS_ADJACENT.nodes.add(node8);
        BFS_ADJACENT.nodes.add(node9);

        int matriks[][] = {
              // A  B  C  D  E  F  G  H  I
                {0, 1, 0, 1, 1, 0, 0, 0, 0}, // Simpul A : value A
                {0, 0, 0, 0, 1, 0, 0, 0, 0}, // Simpul B : value B
                {0, 1, 0, 0, 0, 0, 0, 0, 0}, // Simpul C : value C
                {0, 0, 0, 0, 0, 0, 1, 0, 0}, // Simpul D : value D
                {0, 0, 0, 0, 0, 1, 0, 1, 0}, // Simpul E : value E
                {0, 0, 1, 0, 0, 0, 0, 1, 0}, // Simpul F : value F
                {0, 0, 0, 0, 0, 0, 0, 1, 0}, // Simpul G : value G
                {0, 0, 0, 0, 0, 0, 0, 0, 1}, // Simpul H : value H
                {0, 0, 0, 0, 0, 1, 0, 0, 0}, // Simpul I : value I
        };

        System.out.print("Traversal Graph : ");
        BFS_ADJACENT bfs_adjacent = new BFS_ADJACENT();
        bfs_adjacent.bfs(matriks, node1);
        System.out.println("");
    }

    private static void dfs(){
        NodeAdjacent node1 = new NodeAdjacent('A');
        NodeAdjacent node2 = new NodeAdjacent('B');
        NodeAdjacent node3 = new NodeAdjacent('C');
        NodeAdjacent node4 = new NodeAdjacent('D');
        NodeAdjacent node5 = new NodeAdjacent('E');
        NodeAdjacent node6 = new NodeAdjacent('F');
        NodeAdjacent node7 = new NodeAdjacent('G');
        NodeAdjacent node8 = new NodeAdjacent('H');
        NodeAdjacent node9 = new NodeAdjacent('I');
        DFS_ADJACENT.nodes.add(node1);
        DFS_ADJACENT.nodes.add(node2);
        DFS_ADJACENT.nodes.add(node3);
        DFS_ADJACENT.nodes.add(node4);
        DFS_ADJACENT.nodes.add(node5);
        DFS_ADJACENT.nodes.add(node6);
        DFS_ADJACENT.nodes.add(node7);
        DFS_ADJACENT.nodes.add(node8);
        DFS_ADJACENT.nodes.add(node9);

        int matriks[][] = {
                // A  B  C  D  E  F  G  H  I
                {0, 1, 0, 1, 1, 0, 0, 0, 0}, // Simpul A : value A
                {0, 0, 0, 0, 1, 0, 0, 0, 0}, // Simpul B : value B
                {0, 1, 0, 0, 0, 0, 0, 0, 0}, // Simpul C : value C
                {0, 0, 0, 0, 0, 0, 1, 0, 0}, // Simpul D : value D
                {0, 0, 0, 0, 0, 1, 0, 1, 0}, // Simpul E : value E
                {0, 0, 1, 0, 0, 0, 0, 1, 0}, // Simpul F : value F
                {0, 0, 0, 0, 0, 0, 0, 1, 0}, // Simpul G : value G
                {0, 0, 0, 0, 0, 0, 0, 0, 1}, // Simpul H : value H
                {0, 0, 0, 0, 0, 1, 0, 0, 0}, // Simpul I : value I
        };

        DFS_ADJACENT dfsExample = new DFS_ADJACENT();
        System.out.print("Traversal Graph : ");
        dfsExample.dfs(matriks, node1);
        System.out.println();

    }
}
