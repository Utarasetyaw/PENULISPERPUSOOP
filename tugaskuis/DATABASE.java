package DATABASE;

import BUKU.BUKU;
import PENULIS.PENULIS;
import USER.USER;

public class DATABASE {
    static BUKU[] BUKU;
    static PENULIS[] PENULIS;
    static USER[] USER;


    public static void DATABASE() {
        PENULIS = new PENULIS[5];
        PENULIS[0] = new PENULIS("Prof Utara", "Jangan capek CODING", "15");
        PENULIS[1] = new PENULIS("Prof Yuda", "Coding is fun", "15");
        PENULIS[2] = new PENULIS("Prof Arda", "Coding terus sampek sukses", "15");
        PENULIS[3] = new PENULIS("Prof Egaz", "Cdding if my life", "15");
        PENULIS[4] = new PENULIS("Prof Dea", "KADANG CAPEK NGODING JUGA WOY ", "15");

        BUKU = new BUKU[10];
        BUKU[0] = new BUKU("JAVA", "KAPAN TERAKIR", new PENULIS[]{PENULIS[0], PENULIS[1]}, 3);
        BUKU[1] = new BUKU("PYTHON", "KALI KAMU DAPAT", new PENULIS[]{PENULIS[3]}, 3);
        BUKU[2] = new BUKU("C++", "TERTIDUR TENANG", new PENULIS[]{PENULIS[3]}, 3);
        BUKU[3] = new BUKU("C#", "TAK PERLU MEMIKIRKAN", new PENULIS[]{PENULIS[3]}, 3);
        BUKU[4] = new BUKU("PHP", "CODING WAKTU PEMLAN", new PENULIS[]{PENULIS[4]}, 2);
        BUKU[5] = new BUKU("RUBY", "CAPEK WOYYY", new PENULIS[]{PENULIS[4]}, 2);
        BUKU[6] = new BUKU("KOTLIN", "TAPI SERUU", new PENULIS[]{PENULIS[1]}, 2);
        BUKU[7] = new BUKU("HTML", "YUK KASIH SOAL YANG SULIT LAGI", new PENULIS[]{PENULIS[2]}, 2);
        BUKU[8] = new BUKU("JAVA SCRIPT", "SAMPEK BERGADANG 2 MINGGU", new PENULIS[]{PENULIS[2]}, 2);
        BUKU[9] = new BUKU("CSS", "DARIPADA NGOPI MULU MENDING NGODING", new PENULIS[]{PENULIS[3], PENULIS[4]}, 1);

        USER = new USER[3];
        USER [0]  = new USER("RAFLY", "0033",3);
        USER [1] = new USER("ANANTA", "08373",5);
        USER [2] = new USER("WICAK", "03843",4);


    }
    public static void tampilkanpenulis() {
        for (int i = 0; i < BUKU.length; i++) {
            BUKU[i].tampilInfoPenulis();

        }

    }
    public static void peristiwa() {
        USER[0].pinjam(new String[] {"JAVA", "C#", "KOTLIN"}, BUKU);
        USER[1].pinjam(new String[] {"PYTHON", "PHP", "KOTLIN","HTML","CSS","JAVA SCRIPT"}, BUKU);
        USER[2].pinjam(new String[] {"C++", "PYTHON", "C#","KOTLIN"}, BUKU);

        }
    }

