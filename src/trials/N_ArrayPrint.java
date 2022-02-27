package trials;

public class N_ArrayPrint {

	public static void main(String[] args) {
		
		int n[] = new int[5];
		n[0] = 4;
		n[1] = 3;
		n[2] = 2;
		n[3] = 1;
		n[4] = 0;
		
		for(int k = 0; k<n.length; k++) {
			System.out.println("n =  " + n[k]);
		}
		System.out.println("*******************");
		for(int i = n.length-1; i>=0; i--) {
			System.out.println("n = " + n[i]);
		}
	}

}
