package timeComlaxity;

public class TC {

	public static void main(String[] args) {
		
		int i = 10;
		System.out.println(i);
		
	//TC: Big 0 -->0(1)--constant time
	
		//1 to 10
		for(int p=1;p<=10;p++) {
			System.out.println(p);
		
		//p<= will considered as n:1+n+n+n => 1+3n => 3n+1 ==> Linear Equation
			//3n => 0(n)
		}
		for(int p=1;p<=10;p++) {
			for(int q=1;q<=10;q++) {
				System.out.println(p+""+q);
				
			//TC for this loop is:
				//first loop:(1+n+n)secons loop:(1+n+n+n)last( n )is for syso..print
				//which brings to:(1+2n)(1+3n)==>1+3n+2n+6n^2
				//==>6n^2+5n+1==>Quadratic Equation
				//remove constant(1)==>6n^2+5n==>
				//n as common ==>n(6n+5)==>remove constant5 ==>6n^2
				//remove 6 to generalize ==>0(n^2)
				
			}
		}
		for(int p=1;p<=10;p++) {
			for(int q=1;q<=10;q++) {
				for(int r=1;r<=10;r++) {
					System.out.println(p + " " + q + " " + r);
				
				//(1+n+n)(1+n+n)(1+n+n+n)==>(1+2n)(1+2n)(1+3n)==>12^3==>0(n^3)
				
				}
			}
			
		}

	}

}
