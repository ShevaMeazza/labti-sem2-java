import java.util.Scanner;

public class LatihanIf{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nilai anda :");
        int nilai = input.nextInt();

        if (nilai >=80) {
            System.out.print("Predikat Kamu A");
        } else if (nilai >= 60) {
            System.out.print("Predikat Kamu B");
        } else if (nilai >= 40){
            System.out.print("Predikat Kamu C");            
        } else {
            System.out.print("Maaf anda tidak lulus");
        }

    }
}