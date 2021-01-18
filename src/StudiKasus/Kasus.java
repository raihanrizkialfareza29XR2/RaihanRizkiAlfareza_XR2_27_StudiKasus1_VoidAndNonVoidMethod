package StudiKasus;

public class Kasus {
    public static void main(String[] args) {
        Studi Segitiga = new Studi();
        Segitiga.input();
        Segitiga.hitung();
        System.out.println("");
        System.out.println("Nama Anda Adalah : " + Segitiga.Nama());
        System.out.println("Alas : " + Segitiga.ALAS() + " Cm");
        System.out.println("Tinggi : " + Segitiga.TINGGI() + " Cm");
        System.out.println("Hasil Penghitungan : " + Segitiga.HASIL() + " Cm");
        System.out.println("Penyelesaian : (" + Segitiga.ALAS() + " x " + Segitiga.TINGGI() + ") :2 = " + Segitiga.HASIL() + " Cm");
    }
}
