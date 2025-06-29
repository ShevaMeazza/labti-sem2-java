import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class Act7 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String nama, npm, grade, keterangan;
        int pilih, nilai = 0;

        PrintStream diskWriter = new PrintStream("sheva.txt"); // Untuk File .txt gunakan nama dan npm masing - masing
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
                    System.out.print("NPM = ");
                    npm = input.next();
                    System.out.print("Nilai = ");
                    nilai = input.nextInt();

                    if (nilai >= 80) {
                        System.out.println("Selamat Anda Lulus");
                        grade = "A";
                        keterangan = "Selamat Anda Lulus";
                    } else if (nilai >= 70) {
                        System.out.println("Selamat Anda Lulus");
                        grade = "B";
                        keterangan = "Selamat Anda Lulus";
                    } else if (nilai >= 60) {
                        System.out.println("Selamat Anda Lulus");
                        grade = "C";
                        keterangan = "Selamat Anda Lulus";
                    } else if (nilai >= 50) {
                        grade = "D";
                        keterangan = "Anda Harus Mengulang";
                    } else {
                        grade = "E";
                        keterangan = "Anda Harus Mengulang";
                    }

                    System.out.println("\n Nama : " + nama + "\n NPM : " + npm + "\n Nilai : " + nilai + "\n Grade : " + grade + "\n Keterangan : " + keterangan + "\n");
                    diskWriter.println("Nama : " + nama + "\nNPM : " + npm + "\nNilai : " + nilai + "\nGrade : " + grade + "\nKeterangan : " + keterangan);
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
