package trials;

import java.util.Scanner;

public class Trials {

	
	public static void main(String[] args) {
		String s = "Love coding";
		char[] chars = s.toCharArray();
		int length =chars.length;
		for(int i = length-1; i>=0; i--) {
			System.out.print(chars[i]);
		}
		System.out.println("");
		String revWordsPyramid = "";
		for(int i = length-1; i>=0; i--) {
			revWordsPyramid = revWordsPyramid + s.charAt(i);
			System.out.println(revWordsPyramid);
	}
		//time converter days into seconds
		System.out.println("Enter days to be converted");
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int hours = days *24;
		int min = hours *60;
		int sec = min *60;
		System.out.println(sec);
		System.out.print(hours + " " + min + " " + sec);
	sc.close();
	}


	/*//loan calculator
	Scanner sc1 = new Scanner(System.in);
	int amount = sc1.nextInt();
	int months = 3;
	for(int i=0;i<months;i++) {
		amount = amount * 90/100;//90 is the 10% intrest remaining from 100
		System.out.println(amount);
		sc1.close();
	}*/
}


