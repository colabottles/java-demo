public class Calculator {
    public static double average(int[] numbers) {
        /*
           Testing commenting
           in a multi-line comment
         */
        if (numbers.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double avg;
        avg = (double) sum / numbers.length;
        return avg;
    }
}


