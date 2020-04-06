package USER;

import BUKU.BUKU;

public class USER {

    private String nama;
    private String nomor;
    private int jumlah;

    public USER(String nama, String nomor, int jumlah) {
        this.nama = nama;
        this.nomor = nomor;
        this.jumlah = jumlah;
    }

    public USER() {
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public USER pinjam(String[] Pinjam, BUKU[] data) {
        USER temp = new USER();
        String kosong = "";
        int masih = 0;
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Nomor Pelanggan\t: " + nomor);
        System.out.print("List buku\t: ");
        for (String judulBook : Pinjam) {
//            int ketemu = 0;
            for (BUKU booku : data) {
                if (judulBook.equals(booku.getJudul())) {
//                    ketemu = 1;
                    if (booku.masih()) {
                        masih = 1;
                        System.out.print(booku.getJudul() + ", ");
                        this.jumlah++;
                        break;
                    } else {
                        kosong += "stok buku " + booku.getJudul() + " habis.";
                    }
                }
            }

        }
        if (masih == 1) {
            System.out.print("\b\b\n");
        }
        System.out.println("HARGA\t: Rp " + harga() + ",-");
        if (!kosong.equals("")) {
            System.out.println();
            System.out.println("Note:");
            System.out.println(kosong);
        }
        System.out.println("");
        return temp;
    }

    public int harga() {
        if (jumlah <= 3) {
            return 1000 * jumlah;
        } else {
            return 1000 * 3 + 1100 * (jumlah - 3);
        }
    }
}
