public class Main {
    public static void main(String[] args) {
        int[] numbers = {23, 43, 12, 50, 5, 17, 8, 60, 11, 3};
        HeapSorter heapSorter = new HeapSorter(numbers);
        heapSorter.sort();
        heapSorter.show();
    }

    private void minHeap(){
        MinHeap q = new MinHeap();
        q.add(new WorkOrder(5, "kuliah"));
        q.add(new WorkOrder(8, "tidur"));
        q.add(new WorkOrder(2, "olahraga"));
        q.add(new WorkOrder(3, "mandi"));
        q.add(new WorkOrder(1, "bangun tidur"));
        q.add(new WorkOrder(7, "jalan-jalan"));
        q.add(new WorkOrder(6, "ngerjain tugas"));
        q.add(new WorkOrder(4, "sarapan"));

        while (q.size() > 0)
            System.out.println(q.remove());
    }
}
