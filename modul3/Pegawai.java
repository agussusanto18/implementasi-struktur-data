/**
 * Nama: Agus susanto
 * Kelas: D3 RPLA 4505
 * NIM: 6706210162
 */

public class Pegawai {
    private String nip;
    private String nama;
    private String divisi;

    public Pegawai(String nip, String nama, String divisi) {
        this.nip = nip;
        this.nama = nama;
        this.divisi = divisi;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public String toString() {
        return "nip='" + nip + '\'' +
                ", nama='" + nama + '\'' +
                ", divisi='" + divisi + '\''
                ;
    }
}