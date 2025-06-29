import java.io.*;

public class input {
    public static void main(String[] args) {
        try {
            String nama;
            System.out.println("masukan nama anda : ");
            BufferedReader tulis = new BufferedReader(new InputStreamReader(System.in));
            nama = tulis.readLine();
            System.out.println("nama anda adalah : " + nama);
        } catch(IOException ie){
            System.out.println(ie.getMessage());
        }
    }
}

