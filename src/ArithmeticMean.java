import java.util.Scanner;
public class ArithmeticMean {
	int[] numbers;
    ArithmeticMean(int count) {		// Constructor to initialize the array
        numbers = new int[count];
    }
    void calculateA() {		// Method to calculate the arithmetic mean (average) of the numbers
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Arithmetic mean: " + (double) sum / numbers.length);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of numbers: ");		// Tell the user to input the count of numbers
        int count = scanner.nextInt();
        ArithmeticMean a = new ArithmeticMean(count); // Create an instance of the class ArithmeticMean 
        for (int i = 0; i < count; i++) {
            System.out.print("Enter number " + (i + 1) + ": "); // Tell the user to input each number and add it to the array
            a.numbers[i] = scanner.nextInt();
        }
        a.calculateA();		// Calculate the arithmetic mean of the numbers and print it
    }
}

