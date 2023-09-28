package arijit;

public class Sum {
    public static void main(String[] args) {
        int start = 25;
        int end = 51;
        int sum = 0;

        // Loop through the range and add even numbers to the sum
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("The sum of even numbers between " + start + " and " + end + " is: " + sum);
    }
}
