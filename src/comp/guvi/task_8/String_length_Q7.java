package comp.guvi.task_8;

public class String_length_Q7 {
	
	    public static void main(String[] args) {
	        String msg = "Guvi Geek";

	        int length = calculateStringLength(msg);

	        System.out.println("The length of the string \"" + msg + "\" is: " + length);
	    }

	    private static int calculateStringLength(String str) {
	        if (str == null) {
	            return 0;
	        }
	        return str.length();
	    }
	}


