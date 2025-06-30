import java.util.Scanner;

public class UjianSedang {

    // method penjumlahan
    public int tambah(int a, int b){
        return a + b;
    }
    // method pengurangan
    public int kurang(int a, int b){
        return a - b;
    }
    // method perkalian
    public int kali(int a, int b){
        return a * b;
    }
    // method pembagian
    public int bagi(int a, int b){
        if (b == 0) {
            System.out.println("tidak bisa membagi dengan 0");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UjianSedang kalkulator = new UjianSedang();

        System.out.print("Masukan angka 1 : ");
        int angka1 = input.nextInt();
        System.out.print("Masukan angka 2 : ");
        int angka2 = input.nextInt();

        System.out.println("pilih metode operasi : ");     
        System.out.println("1. penjumlahan");
        System.out.println("2. pengurangan");
        System.out.println("3. perkalian");
        System.out.println("4. pembagian");

        System.out.print("masukan pilihan anda : ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("hasil penjumlahan" + kalkulator.tambah(angka1, angka2));
                break;
            case 2:
                System.out.print("hasil pengurangan" + kalkulator.kurang(angka1, angka2));
                break;
            case 3:
                System.out.print("hasil perkalian" + kalkulator.kali(angka1, angka2));
                break;
            case 4:
                System.out.print("hasil pembagian" + kalkulator.bagi(angka1, angka2));
                break;
        
            default:
                System.out.print("pilihan tidak valid");
                break;
        }

    }
}
