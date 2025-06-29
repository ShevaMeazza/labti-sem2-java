import javax.swing.*;

public class Average2 {
    public static void main(String args[]) {
        int total;
        int nilaiCounter;
        int nilai;
        int average;
        String nilaiString;

        total = 0;
        nilaiCounter = 0;

        nilaiString = JOptionPane.showInputDialog(
            "Masukkan Nilainya atau -1 untuk berhenti: ");
        nilai = Integer.parseInt(nilaiString);

        while (nilai != -1) {
            total = total + nilai;
            nilaiCounter = nilaiCounter + 1;

            nilaiString = JOptionPane.showInputDialog(
                "Masukkan Nilainya atau -1 untuk berhenti: ");
            nilai = Integer.parseInt(nilaiString);
        }

        if (nilaiCounter != 0) {
            average = total / nilaiCounter;

            JOptionPane.showMessageDialog(
                null,
                "Nilai Rata-rata Kelas: " + average,
                "Hasil",
                JOptionPane.INFORMATION_MESSAGE
            );
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Tidak ada nilai yang dimasukkan",
                "Hasil",
                JOptionPane.INFORMATION_MESSAGE
            );
        }

        System.exit(0);
    }
}
