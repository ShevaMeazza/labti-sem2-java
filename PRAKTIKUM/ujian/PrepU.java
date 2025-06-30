import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class PrepU {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String nama, barang;
        int jumlah, harga, pilihan;

        PrintStream diskWriter = new PrintStream("skrip.txt");
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("==============");
            System.out.println("SELAMAT DATANG");
            System.out.println("==============");
            System.out.println("Pilih inputan : ");
            System.out.println("1. Beli barang");
            System.out.println("2. Keluar ");
            System.out.print("masukan pilihan kamu : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    input.nextLine();

                    System.out.print("nama : ");
                    nama = input.nextLine();
                    System.out.println("barang : ");
                    barang = input.nextLine();
                    System.out.println("harga : ");
                    harga = input.nextInt();
                    System.out.println("jumlah : ");
                    jumlah = input.nextInt();

                    System.out.println("\nama: " + nama + "\n barang : " + barang + "\n harga:" + harga + "\n jumlah: " + jumlah + "\n total:" + harga*jumlah);

                    diskWriter.println("\nama: " + nama + "\n barang : " + barang + "\n harga:" + harga + "\n jumlah: " + jumlah + "\n total:" + harga*jumlah);
                    break;
                case 2:
                    System.out.print("terimakasih");
                    System.exit(0);
                    break;
            
                default:
                    System.out.print("pilihan tida tersedia");
                    break;
            }
        } while (pilihan != 2);
        input.close();
        diskWriter.close();
    }
}