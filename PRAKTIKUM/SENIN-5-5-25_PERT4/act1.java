import java.util.Scanner;

public class act1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Jumlah Array Pertama :");
        int array_pertama = input.nextInt();    
        int[] array1 = new int[array_pertama];    

        System.out.println("Masukan Jumlah Array Kedua :");
        int array_kedua = input.nextInt();
        int[] array2 = new int[array_kedua];
        
        for(int i=0; i < array1.length; i++){            
            System.out.println("Masukkan array 1 indeks ke : " + i);
            array1[i] = input.nextInt();
            
        }
        for(int j=0; j < array2.length; j++){            
            System.out.println("Masukkan array 2 indeks ke : " + j);
            array2[j] = input.nextInt();
            
        }
        
        for(int a=0; a < array1.length; a++){
            System.out.println("Array pertama : " + array1[a]);
            
        }
        for(int b=0; b < array2.length; b++){
            System.out.println("Array kedua : " + array2[b]);
            
        }
        
        System.out.println("Masukkan indeks array yang ingin di jumlah :");
        int jum_arr = input.nextInt();
        System.out.println("Masukkan indeks array yang ingin di kurang :");
        int kur_arr = input.nextInt();

        int total_jum = array1[jum_arr] + array2[jum_arr];
        int total_kur = array1[kur_arr] - array2[kur_arr];

        System.out.print("hasil penjumlahan array :" + total_jum);
        System.out.print("hasil pengurangan array :" + total_kur);
        
    }
}