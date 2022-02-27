package trials;

public class StarPaternLogic {
	
public static void starPatern(int i, int j) {
	/*
	 *   *
	 *   **
	 *   ***
	 *   ****
	 *   *****
	 */
	for(i=0;i<=4;i++) {
		for(j=0; j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
	public static void starPatern2(int i, int j) {
		/* *****
		 * ****
		 * ***
		 * **
		 * *
		 */
	System.out.println("-------------");
		for(i=0;i<=4;i++) {//increase rows
			for(j=4;j>=i;j--) {//it is important to put j>=i and not 0 otherwise it will print 4x 5stars
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
public static void starPatern3(int i, int j, int a, int b) {
	
	/* *
	 * **
	 * ***
	 * ****
	 * *****
	 * ****
	 * ***
	 * **
	 * *
	 */
	System.out.println("------------");
	for(i=0;i<=4;i++) {
		for(j=0; j<=i;j++) {
			System.out.print("*");
		}
		System.out.println();
	}

for(a=0;a<=4;a++) {
	for(b=4;b>a;b--) {
		System.out.print("*");
	}
	System.out.println();
}
}
public static void starPatern4(int i, int j, int k) {
	/*
	 *      *
	 *     **
	 *    ***
	 *   ****
	 *  *****
	 */
	System.out.println("----------");
	for(i=1;i<=5;i++) {//one for spaces
		for(j=4;j>=i;j--) {
			System.out.print(" ");
		}
		for(k=1;k<=i;k++) {//second to feel with stars
			System.out.print("*");
		}
		System.out.println();
	
	}
	System.out.println("------------");
}

public static void starPatern5(int i, int j, int k) {
	/*
	 *      *
	 *     * *
	 *    * * *
	 *   * * * *
	 *  * * * * *
	 */
	
	for(i=1;i<=5;i++) {//one for spaces
		for(j=4;j>=i;j--) {
			System.out.print(" ");
		}
		for(k=1;k<=i;k++) {//second to feel with stars
			System.out.print(" *");//all needs to be done is put space before *
		}
		System.out.println();
	
	}
	System.out.println("------------");
}
public static void capitalAlphabetPatern(int i, int j, int alfa) {
	/* A//ASCII=65
	 * A B
	 * A B C
	 * A B C D
	 * A B C D E
	 * A B C D E F
	 */
	for(i=0;i<=5;i++) {
		for(j=0;j<=i;j++) {
			System.out.print((char)(alfa+j)+" ");//65+0=65->A,65+1=66->B....
		}
		System.out.println();
	}
	System.out.println("-------------");
}
public static void smallAlphabetPatern(int i, int j, int alfa) {
	/* a//ASCII=97
	 * ab
	 * abc
	 * abcd
	 * abcde
	 * abcdef
	 */
	for(i=0;i<=10;i++) {
		for(j=0;j<=i;j++) {
			System.out.print((char)(alfa+j));//+" ");//97+0=65->a,98+1=66->b....
		}
		System.out.println();
	}
	System.out.println("-------------");
}


	public static void main(String[] args) {
		starPatern(0, 0);
		starPatern2(0, 4);
		starPatern3(0, 0, 0, 4);
		starPatern4(1, 4, 1);
		starPatern5(1, 4, 1);
		capitalAlphabetPatern(0, 0, 65);
		smallAlphabetPatern(0, 0, 97);
		/*int i=0;
		int j=0;
		
		for(i=0;i<=4;i++) {
			for(j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
	}
		
	}


