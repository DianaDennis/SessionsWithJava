package trials;

public class ReverseANumber {
	
	public static void reverseNumberUsingRecursion(int num) {
		if(num<10) {
			System.out.println(num);
			return;
		}
		else {
			System.out.println(num%10);
			reverseNumberUsingRecursion(num/10);
		}
	}
		public static void reverseString(int len,String s,String rev) {
			//string is immutable so the reverse function is not available
			//s = "Selenium";
			//len = s.length();//8
			//String rev = "";
			
			//1. using for loop
			for(int i = len-1;i>=0;i--) {
				rev = rev + s.charAt(i);//why append with rev?it will be blank +m
			}
			System.out.println(rev);
			
			}
		//2.using StringBuffer class,it has revers function
		public static void reverseStringBufferClass(String s) {
			//StringBuffer is mutable so we can pass revers function
			StringBuffer sf = new StringBuffer(s);
			System.out.println(sf.reverse());	
	}

		public static void reverseInteger(long num, long rev) {//(int num, int rev) {
			//1.solution using proper algorithm
			//int num = 12345;without parameters!!!
			//int rev = 0;
			//better to store in long variable
			
			while(num !=0) {
				rev =rev *10 + num % 10;//5, 0*10=0
				num = num / 10;//12345/10=1234
			}
			System.out.println("Reverse number is ::" + rev);
		}
			public static void 	reverseIntegerUsingStrinBuffer(long num) {
			//2.using StringBuffer method
			//without parameters->long num =567;
				System.out.println(new StringBuffer(String.valueOf(num)).reverse());
		}
		
		
		
	public static void main(String[] args) {
		reverseNumberUsingRecursion(1234);
		reverseNumberUsingRecursion(001);
		reverseNumberUsingRecursion(100);
		reverseNumberUsingRecursion(0);
		reverseString(8, "Selenium", "");
		reverseString(4, "Java", "");
		reverseStringBufferClass("Diana");
		reverseStringBufferClass("Hello World");
		//reverseInteger(12345, 0);//Declaring numbers here
		//reverseInteger(-23, 0);
		reverseInteger(1234567, 0);
		reverseIntegerUsingStrinBuffer(567);
	}

}

