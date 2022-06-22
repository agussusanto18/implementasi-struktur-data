import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_ADJACENT {
    private Queue<NodeAdjacent> queue = new LinkedList<>();
    static ArrayList<NodeAdjacent> nodes = new ArrayList<>();

    public ArrayList<NodeAdjacent> listTetangga(int[][] matriks, NodeAdjacent x){
        int idx = -1;
        ArrayList<NodeAdjacent> arrayTetangga = new ArrayList<>();
        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).getData() == x.getData()){
                idx = i;
                break;
            }
        }

        if (idx != -1) {
            for (int i = 0; i < matriks[idx].length; i++) {
                if (matriks[idx][i] == 1){
                    arrayTetangga.add(nodes.get(i));
                }
            }
        }

        return arrayTetangga;
    }

    public void bfs(int matriks[][], NodeAdjacent node) {
        queue.add(node);
        node.setVisited(true);

        while (!queue.isEmpty()) {
            NodeAdjacent element = queue.remove();
            System.out.print(element.getData() + "_");
            ArrayList<NodeAdjacent> tetangga = listTetangga(matriks, element);

            for (int i = 0; i < tetangga.size(); i++) {
                NodeAdjacent n = tetangga.get(i);
                if (n != null && !n.isVisited()) {
                    queue.add(n);
                    n.setVisited(true);
                }
            }
        }
    }
}
