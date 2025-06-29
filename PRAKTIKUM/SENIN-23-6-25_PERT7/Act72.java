import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class Act72 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String nama, barang;
        int harga, jumlah, pilih = 0;

        PrintStream diskWriter = new PrintStream("act2.txt"); 
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("===========Universitas Gunadarma===========");
            System.out.println("1. Input Nilai");
            System.out.println("2. Keluar");
            System.out.println("===========================================");
            System.out.print("Pilihan = ");
            pilih = input.nextInt();
            System.out.println("");

            switch (pilih) {
                case 1:
                    System.out.print("Nama = ");
                    nama = input.next();
                    System.out.print("Barang = ");
                    barang = input.next();
                    System.out.print("Harga = ");
                    harga = input.nextInt();
                    System.out.print("jumlah = ");
                    jumlah = input.nextInt();                    

                    System.out.println("\n Nama : " + nama + "\n Barang : " + barang + "\n harga : " + harga + "\n jumlah : " + jumlah + "\n total : " + harga*jumlah + "\n");
                    diskWriter.println("Nama : " + nama + "\n Barang : " + barang + "\nharga : " + harga + "\njumlah : " + jumlah + "\ntotal : " + harga*jumlah);
                    diskWriter.println("\n");
                    break;
                                        

                case 2:
                    System.out.println("Terima Kasih");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan Tidak Tersedia");
            }

        } while (pilih != 2);

        input.close();
        diskWriter.close();
    }
}
