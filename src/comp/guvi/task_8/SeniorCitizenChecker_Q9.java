package comp.guvi.task_8;

	import java.util.Scanner;

	public class SeniorCitizenChecker_Q9 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your age: ");

	        int age = scanner.nextInt();

	        if (isSeniorCitizen(age)) {
	            System.out.println("You are a senior citizen.");
	        } else {
	            System.out.println("You are not a senior citizen.");
	        }

	        scanner.close();
	    }

	    private static boolean isSeniorCitizen(int age) {
	        return age >= 60;
	    }
	}


