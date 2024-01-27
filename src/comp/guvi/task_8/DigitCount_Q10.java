package comp.guvi.task_8;

	import java.util.Scanner;

	public class DigitCount_Q10 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an integer: ");

	        int number = scanner.nextInt();

	        int digitCount = countDigits(number);

	        System.out.println("Number of digits in " + number + " is: " + digitCount);

	        scanner.close();
	    }

	    private static int countDigits(int num) {
	        num = Math.abs(num);

	        if (num == 0) {
	            return 1;
	        }

	        int count = 0;
	        while (num > 0) {
	            count++;
	            num /= 10;
	        }
	        return count;
	    }
	}


