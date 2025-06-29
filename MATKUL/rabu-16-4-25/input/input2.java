import java.io.*;

public class input2 {
    public static void main(String[] args) throws IOException {
        
        System.out.println(("input bilangan : "));
        DataInputStream masukan = (new DataInputStream(System.in));
        int bilangan = Integer.parseInt(masukan.readLine());
        System.out.println("bilangan yang ada dimasukan : " +bilangan);
    }
}

