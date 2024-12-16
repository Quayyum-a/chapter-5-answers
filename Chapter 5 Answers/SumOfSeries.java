public class SumOfSeries {
    public static void main(String[] args) {
        System.out.printf("%-10s%-20s%n", "n", "Sum");

        for (long n = 1; n <= 100; n++) {
            
            long sum = n * (n + 1) / 2;

            
            System.out.printf("%-10d%-20d%n", n, sum);
        }
    }
}
