package StudiKasus;

import java.util.Scanner;

public class Studi {
    boolean running = true;
    String nama;
    double alas;
    double tinggi;
    double hasil;

    void input (){
        while (running){
            Scanner hehe = new Scanner(System.in);
            System.out.println("|================================|");
            System.out.println("|Program Menghitung Luas Segitiga|");
            System.out.print("|Silakan Masukkan Nama Anda : ");
            nama = hehe.nextLine();
            System.out.print("|Silakan Masukkan Nilai Alas : ");
            alas = hehe.nextDouble();
            System.out.print("|Silakan Masukkan Nilai Tinggi : ");
            tinggi = hehe.nextDouble();
            System.out.print("|================================|");
            System.out.println("");
            Scanner darurat = new Scanner(System.in);
            System.out.println("");
            System.out.print("Apakah Anda Yakin? Ingin Mengulang Atau Tidak? (Y/T) : ");
            String x = darurat.nextLine();
            if(x.equalsIgnoreCase("T")){
                running = false;
            }
        }
    }

    void hitung (){
        hasil = ((alas*tinggi)/2);
    }
    String Nama (){
        return nama;
    }
    double ALAS (){
        return alas;
    }
    double TINGGI (){
        return tinggi;
    }
    double HASIL (){
        return hasil;
    }


}
