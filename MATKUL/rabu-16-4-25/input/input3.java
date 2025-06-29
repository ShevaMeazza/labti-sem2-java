import javax.swing.*;

public class input3 {
    public static void main(String[] args) {
        
        String nama;
        nama = JOptionPane.showInputDialog("masukan nama : ");
        System.out.println("nama anda : " + nama);
        JOptionPane.showMessageDialog(null,"nama anda : " + nama);
        System.exit(0);
    }    
}

