public class Task {

    public static void main(String[] args) {
        System.out.println(calculateAverage(1, 4, 2, 5, 6, 8, 11));
        System.out.println(calculateAverage(1, 5, -11, 192));
        System.out.println(calculateAverage(1));
        System.out.println(calculateAverage(1, 1, 1));
    }

    private static float calculateAverage(int... args) {
        int sum = 0;
        for (int i : args) {
            sum += i;
        }

        // Remember to cast result to floa to make divison with floating-point number.
        // Without that, result would be "cut down" to integer value.
        return (float) sum / args.length;
    }
}




