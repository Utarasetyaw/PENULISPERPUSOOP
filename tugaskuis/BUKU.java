package BUKU;

import PENULIS.PENULIS;

public class BUKU {

    private String judul;
    private String sinopsis;
    private PENULIS[] penulis;
    private int jumlah;

    public BUKU (String judul, String sinopsis, PENULIS[] penulis, int jumlah) {
        this.judul = judul;
        this.sinopsis = sinopsis;
        this.penulis = penulis;
        this.jumlah = jumlah;
    }

    public BUKU() {
    }

    public String getJudul() {
        return judul;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public PENULIS[] getPenulis() {
        return penulis;
    }

    public int getJumlah() {
        return jumlah;
    }

    public BUKU tampilInfoPenulis() {
        BUKU tempBu = new BUKU();
        System.out.println("Penulis Buku " + judul + " :");
        for (PENULIS get : penulis) {
            System.out.println("Nama\t\t: " + get.getNama());
            System.out.println("Umur\t\t: " + get.getUmur());
            System.out.println("Motivasi\t: " + get.getMotivasi());
        }
        System.out.println("");
        return tempBu;
    }

    public boolean masih() {
        if (jumlah == 0) {
            return false;
        } else {
            jumlah--;
            return true;
        }
    }
}
