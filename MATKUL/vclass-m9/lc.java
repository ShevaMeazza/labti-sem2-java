import java.util.*;

public class lc {

    public static void main(String[] args) {
        String input = "aku seorang bajak laut di tengah laut Somalia, sedang merompak kapal para penjajah Afrika.\n"
                + "Namun aku takut dengan seorang penjajah dari Afrika keturunan India.";

        input = input.replaceAll("[^a-zA-Z ]", "").toLowerCase(); 
        String[] words = input.split("\\s+");

        Map<String, Integer> freq = new LinkedHashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        int max = Collections.max(freq.values());

        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\nKata terbanyak:");
        for (Map.Entry<String, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println("- " + entry.getKey());
            }
        }
    }
}