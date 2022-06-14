import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Mahasiswa, int[]> mahasiswa = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        boolean next = true;
        do {
            System.out.println("\nMasukan pilihan berikut:");
            System.out.println("1. Tambah data");
            System.out.println("2. Hapus data");
            System.out.println("3. Tampilkan data");

            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    System.out.println("\nMasukan data");
                    System.out.println("Nama: ");
                    String nama = scanner.next();
                    System.out.println("NIM: ");
                    String nim = scanner.next();
                    System.out.println("Kelas: ");
                    String kelas = scanner.next();
                    System.out.println("Nilai (Pisahkan dengan spasi): ");
                    int[] nilai = new int[5];

                    for (int i = 0; i < 5; i++) {
                        nilai[i] = scanner.nextInt();
                    }

                    Mahasiswa mahasiswa1 = new Mahasiswa(
                        nim, nama, kelas
                    );

                    mahasiswa.put(mahasiswa1, nilai);
                    break;
                case 2:
                    System.out.println("Masukan NIM: ");
                    String nimDelete = scanner.next();

                    for (Mahasiswa mhs : mahasiswa.keySet()) {
                        if (mhs.getNim().equals(nimDelete)) {
                            mahasiswa.remove(mhs);
                            break;
                        }
                    }
                    break;
                case 3:
                    for (Mahasiswa mhsShow : mahasiswa.keySet()) {
                        System.out.println("\n-------------------------------");
                        System.out.println("NIM: " + mhsShow.getNim());
                        System.out.println("Nama: " + mhsShow.getNama());
                        System.out.println("Kelas: " + mhsShow.getKelas());
                        int[] nilaiShow = mahasiswa.get(mhsShow);
                        String nilaiStr = "";

                        for(int nilaiInt : nilaiShow)
                            nilaiStr += nilaiInt + ", ";

                        System.out.println("Nilai: " + nilaiStr);
                        System.out.println("Nilai Rata-rata: " + Arrays.stream(nilaiShow).sum() / nilaiShow.length);
                    }
                    break;
                default:
                    System.out.println("\nMaaf input tidak valid\n");
                    break;
            }

            System.out.println("\nApakah ingin melanjutkan? (y/n) ");
            char confirm = scanner.next().charAt(0);
            if (confirm == 'y' || confirm == 'Y')
                next = true;
            else
                next = false;
        }while (next);
    }
}
