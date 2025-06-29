import javax.swing.*;

public class Average1 {
    public static void main(String[] args) {
        int total;
        int nilaiCounter;
        int nilai;
        int Average;
        String nilaString;

        total = 0;
        nilaiCounter=1;

        while (nilaiCounter<=5) {
            nilaString = JOptionPane.showInputDialog("masukan nilai : ");
            nilai = Integer.parseInt(nilaString);
            total = total + nilai;
            nilaiCounter = nilaiCounter + 1;
        }
        Average = total / 5;
        JOptionPane.showInputDialog(null,"nilai rata-rata kelas : "+Average,"hasil",
        JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}

