import java.util.ArrayList;
import java.util.Stack;

public class DFS_ADJACENT {

    private Stack<NodeAdjacent> stack = new Stack<>();

    static ArrayList<NodeAdjacent> nodes = new ArrayList<>();

    public ArrayList<NodeAdjacent> listTetangga(int matriks[][], NodeAdjacent x) {
        int idx = -1;
        ArrayList<NodeAdjacent> tetangga = new ArrayList<>();

        for (int i = 0; i < nodes.size(); i++) {
            if (nodes.get(i).equals(x)) {
                idx = i;
                break;
            }
        }

        if (idx != -1) {
                for (int j = 0; j < matriks[idx].length; j++) {
                    if (matriks[idx][j] == 1) {
                        tetangga.add(nodes.get(j));
                    }
                }
        }

        return tetangga;
    }

    public void dfs(int matriks[][], NodeAdjacent node) {
        stack.add(node);

        while (!stack.isEmpty()) {
            NodeAdjacent element = stack.pop();
            if (!element.isVisited()) {
                System.out.print(element.getData() + " ");
                element.setVisited(true);
            }

            ArrayList<NodeAdjacent> tetangga = listTetangga(matriks, element);

            for (int i = 0; i < tetangga.size(); i++) {
                NodeAdjacent n = tetangga.get(i);
                if (n != null && !n.isVisited()) {
                    stack.add(n);
                }
            }
        }
    }

}
