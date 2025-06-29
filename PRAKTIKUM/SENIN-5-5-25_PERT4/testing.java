public class testing {

    public static void main(String[] args) {
        // Example of working with an array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(numbers[1]);

        // Print all elements in the array
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Calculate the sum of all elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of array elements: " + sum);

        // Find the maximum element in the array
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
            max = number;
            }
        }
        System.out.println("Maximum element in the array: " + max);

    }
}
