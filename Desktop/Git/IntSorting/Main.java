import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] sortIntegers(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the number of integers to sort: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort and print the array here
        int[] sortedNumbers = sortIntegers(numbers);
        System.out.println("Sorted integers: " + Arrays.toString(sortedNumbers));
    }
}
