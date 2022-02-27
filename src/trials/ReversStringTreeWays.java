package trials;

public class ReversStringTreeWays {

	public static void main(String[] args) {
		
		//method1
		String s = "Love coding";
		 
		char[] chars = s.toCharArray();
		System.out.println("String length is : " + chars.length);
		
		int length =chars.length;
		for(int i = length-1; i>=0; i--) {
			System.out.print(chars[i]);
		}
		//method2
		System.out.println("");
		String revWordsPyramid = "";
		for(int i = length-1; i>=0; i--) {
			revWordsPyramid = revWordsPyramid + s.charAt(i);
			System.out.println(revWordsPyramid);
		}
		//System.out.println(revWords);
		System.out.println("");
		String revWords = "";
		for(int i = length-1; i>=0; i--) {
			revWords = revWords + s.charAt(i);	
		}
		System.out.println(revWords);
		System.out.println("");
		//method3
		StringBuffer sBuffer = new StringBuffer(s);
		System.out.println(sBuffer.reverse());
		System.out.println("");
		//method4
		StringBuilder sBuilder = new StringBuilder(s);
		System.out.println(sBuilder.reverse());
	}
	
	}
