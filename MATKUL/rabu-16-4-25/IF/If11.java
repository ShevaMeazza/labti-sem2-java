import javax.swing.*;

public class If11 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("masukan nilaimu!");
        int nilai = Integer.parseInt(a);

        JOptionPane.showInputDialog(null, nilai>60?"selamat":"hasi;",
        JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }    
}

