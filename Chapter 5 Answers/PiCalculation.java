public class PiCalculation {
    public static void main(String[] args) {
        double pi = 0.0;
        int terms = 200000;

        System.out.printf("%-10s%-15s%n", "Term", "Approximation");
        for (int i = 1; i <= terms; i++) {
            if (i % 2 == 1) {
                pi += 4.0 / (2 * i - 1);
            } else {
                pi -= 4.0 / (2 * i - 1);
            }

            if (i % 20000 == 0) {
                System.out.printf("%-10d%.10f%n", i, pi);
            }
        }
    }
}
