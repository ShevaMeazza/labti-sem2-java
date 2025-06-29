import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Nama   : ");
        String nama = input.nextLine();

        System.out.print("Masukan NPM    : ");
        String npm = input.nextLine();

        System.out.print("Masukan Kelas  : ");
        String kelas = input.nextLine();

        System.out.print("Masukan jurusan  : ");
        String jurusan = input.nextLine();

        System.out.print("Masukan fakultas  : ");
        String fakultas = input.nextLine();

        System.out.print("Masukan nilai uts  : ");
        double nilai_uts = input.nextDouble();

        System.out.print("Masukan nilai uas  : ");
        double nilai_uas = input.nextDouble();

        double nilai = nilai_uts + nilai_uas;
        double nilai_akhir = nilai / 2;

        System.out.println("==============================================================");
        System.out.println("\t\t\tBiodata Mahasiswa");
        System.out.println("==============================================================");

        System.out.println("==============================================================");
        System.out.println("Nama  : " + nama);
        System.out.println("NPM   : " + npm);
        System.out.println("NPM   : " + kelas);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Fakultas : " + fakultas);
        System.out.println("Nilai Uts : " + nilai_uts);
        System.out.println("Nilai Uas : " + nilai_uas);
        System.out.println("Nilai Akhir : " + nilai_akhir);
        System.out.println("==============================================================");

    }
}

