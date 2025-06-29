import java.util.Scanner;

public class act {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        System.out.print("Bilangan prima dari 2 sampai " + N + " adalah: ");
        for (int i = 2; i <= N; i++) {
            int faktor = 0;
            for (int j = 1; j <= i; j++){
                if(i % j == 0){
                    faktor++;
                }
            }

            if (faktor == 2) {
                System.out.println(i + "");
            }
        }
    }
}
