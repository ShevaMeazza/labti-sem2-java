import java.util.Scanner;

public class Act1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nilai Ujian Tertulis :");
        int ut = input.nextInt();
        System.out.println("Masukan Nilai Ujian Praktek :");
        int up = input.nextInt();
        int nilai_akhir = (ut + up)/2;

        if (nilai_akhir >=70) {
            System.out.println("Selamat Anda Lulus");
            System.out.println("Nilai anda : " + nilai_akhir);

        } else if (nilai_akhir >= 60) {
            System.out.print("Anda lulus tapi ngulang");
        } 
        else {
            System.out.print("Maaf anda tidak lulus");
        }

    }
}