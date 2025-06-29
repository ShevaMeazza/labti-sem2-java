public class Kalkulator {

    
    public int tambah(int a, int b) {
        return a + b;
    }
    
    public int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }
  
    public double bagi(int a, int b) {
        if (b != 0) {
            return (double) a / b; 
        } else {
            System.out.println("Tidak bisa membagi dengan nol!");
            return 0; 
        }
    }

    public static void main(String[] args) {
        
        Kalkulator kalkulator = new Kalkulator();

        
        System.out.println("Penjumlahan: " + kalkulator.tambah(5, 3));
        System.out.println("Pengurangan: " + kalkulator.kurang(5, 3));
        System.out.println("Perkalian: " + kalkulator.kali(5, 3));
        System.out.println("Pembagian: " + kalkulator.bagi(5, 0)); 
        System.out.println("Pembagian: " + kalkulator.bagi(5, 2));
    }
}