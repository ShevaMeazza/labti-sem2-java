import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==============================================================");
        System.out.println("\t\t\tBiodata Mahasiswa");
        System.out.println("==============================================================");

        System.out.print("Masukan Nama   : ");
        String nama = input.nextLine();

        System.out.print("Masukan Kelas  : ");
        String kelas = input.nextLine();

        System.out.print("Masukan NPM    : ");
        String npm = input.nextLine();

        System.out.println("==============================================================");
        System.out.println("Nama  : " + nama);
        System.out.println("NPM   : " + npm);
        System.out.println("Kelas : " + kelas);
        System.out.println("==============================================================");

        System.out.println("\t\t\tHitunglah luas segitiga");
        System.out.println("==============================================================");

        System.out.print("Masukan alas segitiga: ");
        double alas = input.nextDouble();

        System.out.print("Masukan tinggi segitiga: ");
        double tinggi = input.nextDouble();

        double luas = 0.5 * alas * tinggi;

        System.out.println("Luas persegi panjang adalah: " + (int)luas);
        System.out.println("==============================================================");
    }
}