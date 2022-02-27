package trials;

import java.util.Random;
import java.util.Scanner;

public class PasswordValidator {

	private static final String ANSI_BLUE = "\u001B[34m";

    private static char[] password(int len) {
        Random rand = new Random();
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_-+=`~[]{};:'\"\\|/?.>,<";

        char[] password = new char[len];

        for(int i = 0; i < len; i++) {
            password[i] = chars.charAt(rand.nextInt(chars.length()));
        }
        return password;
    }
	
	public static void main(String[] args) {

		 Scanner s = new Scanner(System.in);
	        int len = s.nextInt();
	        System.out.print("Input length ( 8-12 ) : " + len);

	        if(len < 8) {
	            System.out.println("\nThe value must be the same or bigger than 8");
	            System.exit(0);
	        } else if(len > 12){
	            System.out.println("\nThe value must be the same or less than 12");
	            System.exit(0);
	        }

	        System.out.println("\nGenerating password..");
	        System.out.print("Done! Your password is: " + ANSI_BLUE);
	        System.out.println(password(len));
	    }
	}

	

	


