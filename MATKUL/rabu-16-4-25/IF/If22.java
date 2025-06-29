import javax.swing.*;

public class If22 {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("masukan nilaimu!: ");
        int nilai = Integer.parseInt(a);
        if(nilai>60)
        {
            JOptionPane.showInputDialog(null, "selamat anda lulus", "hasil",
            JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showInputDialog(null, "maaf anda belum beruntung", "hasil",
            JOptionPane.INFORMATION_MESSAGE);
        }
        
    System.exit(0);
    }    
}

