public class soal2_TubuhWhileKosong {

    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;

        while (++i < --j) ;

        System.out.println("Titik-tengah adalah " + i);
    }
}
