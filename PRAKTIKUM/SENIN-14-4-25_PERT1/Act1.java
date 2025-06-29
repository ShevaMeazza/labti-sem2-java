import java.util.Scanner;

public class Act1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan Bilangan Pertama : ");
        int bil1 = input.nextInt();
        
        System.out.print("Masukan Bilangan Kedua : ");
        int bil2 = input.nextInt();

        int jumlah = bil1 + bil2;
        int kurang = bil1 - bil2;
        int kali = bil1 * bil2;
        int bagi = bil1 / bil2;

        System.out.println("Hasil Penjumlahan : " + jumlah);
        System.out.println("Hasil Pengurangan : " + kurang); 
        System.out.println("Hasil Perkalian : " + kali);
        System.out.println("Hasil Pembagian : " + bagi);
        
    }
}