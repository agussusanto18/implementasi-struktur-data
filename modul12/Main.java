public class Main {
    public static void main(String[] args) {
        char[] alphabets = {'A', 'D', 'G', 'B', 'E', 'H', 'C', 'F', 'I'};
        AdjacencyMatrix myMatrix = new AdjacencyMatrix(9);

        myMatrix.addEdge(0,1);
        myMatrix.addEdge(0,3);
        myMatrix.addEdge(0,4);
        myMatrix.addEdge(1,2);
        myMatrix.addEdge(2,5);
        myMatrix.addEdge(3,4);
        myMatrix.addEdge(4,5);
        myMatrix.addEdge(4,7);
        myMatrix.addEdge(5,8);
        myMatrix.addEdge(6,3);
        myMatrix.addEdge(7,6);
        myMatrix.addEdge(7,5);
        myMatrix.addEdge(8,7);

        boolean[][] results = myMatrix.getResults();

        for (int i = 0; i < results.length; i++) {
            String edges = alphabets[i] + " => ";

            for (int j = 0; j < results[0].length; j++) {
                if (results[i][j])
                    edges += alphabets[j] + ", ";
            }

            System.out.println(edges);
        }

    }
}
