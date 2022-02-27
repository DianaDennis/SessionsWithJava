package trials;

public class CheckEvenOrOdd {

	public void checkEvenOdd(int a) {
		
		if(a%2==0) {
			System.out.println("Given number is even");
		}else {
			System.out.println("Given number is odd");
		}
	}
	public static void main(String[] args) {
		
		CheckEvenOrOdd evenOdd = new CheckEvenOrOdd();
		evenOdd.checkEvenOdd(4);
		evenOdd.checkEvenOdd(15);
		evenOdd.checkEvenOdd(25);
		evenOdd.checkEvenOdd(20);
		evenOdd.checkEvenOdd(0);
		evenOdd.checkEvenOdd(13);
	}

}
