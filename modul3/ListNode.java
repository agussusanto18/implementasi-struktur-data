/**
 * Nama: Agus susanto
 * Kelas: D3 RPLA 4505
 * NIM: 6706210162
 */

public class ListNode<E> {
    E data;
    ListNode<E> next;
    public ListNode(E object){
        data = object;
        this.next = null;
    }
    public E getData(){
        return data;
    }
}