import java.util.Scanner;

public class addition2 {
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
	
		int number1;
		int number2;
		int sum;
	
		System.out.print("Masukkan angka pertama : ");
		number1 = input.nextInt();
		System.out.print("Masukkan angka kedua : ");
		number2 = input.nextInt();
	
		sum = number1 + number2;
	
		System.out.println("Jumlahnya : "+sum);
	}
}

