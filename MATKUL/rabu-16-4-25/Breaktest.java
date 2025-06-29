import javax.swing.JOptionPane;

public class Breaktest {
    public static void main(String args[]) {
        String output = "";
        int count;

        for (count = 1; count <= 10; count++) {
            if (count == 5)
                break;
            output = output + count + " ";
        }
        output += "\nBerhenti looping pada count = " + count;
        JOptionPane.showMessageDialog(null, output);
        System.exit(0);
    }
}

