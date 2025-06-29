import javax.swing.*;

public class average3 {
    public static void main(String args[]) {
        int total;
        int nilaiCounter;
        int nilai;
        int average;
        String nilaiString;

        total = 0;

        for (nilaiCounter = 1; nilaiCounter <= 5; nilaiCounter++) {
            // Meminta input nilai dari user
            nilaiString = JOptionPane.showInputDialog("Masukkan Nilainya: ");
            // nilaiString masih dalam bentuk String

            nilai = Integer.parseInt(nilaiString);
            // Mengubah String ke integer menggunakan Integer.parseInt (dari java.lang)

            total = total + nilai;
        }

        average = total / 5;

        JOptionPane.showMessageDialog(
            null,
            "Nilai Rata-rata Kelas: " + average,
            "Hasil",
            JOptionPane.INFORMATION_MESSAGE
        );

        System.exit(0);
    }
} // Akhir dari class Average3
