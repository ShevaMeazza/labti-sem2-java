import java.util.Scanner;
public class LatihanSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                Selamat Datang di Restoran Ayam Bu Jafir
                Daftar menu:
                1. Ayam Goreng Malaya
                2. Ayam Pecinan
                3. Ayam Bakar bumbu kuning
                4. Es teh manis
                5. Es gerobak sodor
                """);
        System.out.println("Pilih menu :");
        String pilihan = input.nextLine();

        switch (pilihan) {
            case "1":
                System.out.println("Anda memilih Ayam Goreng Malaya");
                break;
            case "2":
                System.out.println("Anda memilih Ayam Pecinan");
                break;
            case "3":
                System.out.println("Anda memilih Ayam Bakar bumbu kuning");
                break;
            default:
                break;
        }
        
    }
}