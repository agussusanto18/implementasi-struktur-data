/**
 * Nama: Agus susanto
 * Kelas: D3 RPLA 4505
 * NIM: 6706210162
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Pegawai> linkedList =
                new SinglyLinkedList<>();

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1. Input Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cetak List Pegawai");
            System.out.println("4. Keluar");

            int number = input.nextInt();

            if (number == 4) {
                break;
            } else if (number == 3) {
                linkedList.print();
            } else if (number == 2) {
                linkedList.removeFromBack();
            } else if (number == 1) {
                System.out.println("Masukan data");
                System.out.println("Tuliskan nip, nama dan divisi pegawai");
                String nip = input.next();
                String nama = input.next();
                String divisi = input.next();
                System.out.println("Tambahkan data di awal list? (y/n)");
                char confirm = input.next().charAt(0);

                if (confirm == 'y') {
                    linkedList.insertAtFront(new Pegawai(nip, nama, divisi));
                } else {
                    linkedList.insertAtBack(new Pegawai(nip, nama, divisi));
                }
            }
        }
    }
}
