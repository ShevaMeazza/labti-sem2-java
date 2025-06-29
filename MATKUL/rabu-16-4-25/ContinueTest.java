import javax.swing.JOptionPane;

public class ContinueTest {
    public static void main(String args[]) {
        String output = "";
        int count;

        for (count = 1; count <= 10; count++) {
            if (count == 5)
                continue;

            output = output + count + " ";

        }

        output += "\nMenggunakan continue untuk skip mencetak 5";
        JOptionPane.showMessageDialog(null, output);
        System.exit(0);
    }
}
