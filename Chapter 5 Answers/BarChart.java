import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers between 1 and 30:");

        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
            if (numbers[i] < 1 || numbers[i] > 30) {
                System.out.println("Invalid input. Enter a number between 1 and 30.");
                i--;
            }
        }

        System.out.println("Bar Chart:");

        
        for (int num : numbers) {
            for (int j = 0; j < num; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}