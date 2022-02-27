package javaSessions;

public class WrapperClassConcept {

	public static void main(String[] args) {
	
		
		String x = "100";//cannot do arithmetic operations because one is in string store(SCP=>stands for string constant pool) and other in stack
		//x=x+30;//output:1003020
		System.out.println(x+20);//output:10020
		//System.out.println(x);//output:10030
		//String y = "100";//it will just create one reference variable because 100 is already there in "SCP"
		/*
		 * if i want to perform arithmetic operation i need
		 * to use wrapper class:convert 100 into integer
		 */
		//String to int:wrapper class Integer:
		int i = Integer.parseInt(x);//store in int will be 100 int not a string
		System.out.println(i+20);//output:120
		
		
		
		
		String y = "100A";
		//int k = Integer.parseInt(y);
		//System.out.println(k+30);//NumberFormatException
		System.out.println(y.substring(0));
		/*String p[] = y.split("100A");
		System.out.println("----");
		System.out.println(p[0]);
		System.out.println("----");
		System.out.println(p[1]);
		System.out.println(p[2]);
		System.out.println(p[3]);*/
		
		//first remove then split
		
		
		//string to double:
		String total = "120.33";
		double d = Double.parseDouble(total);
		System.out.println(d+10.33);
		
		//String to boolean:
		String flag = "true";
		boolean fg = Boolean.parseBoolean(flag);
		if(fg) {
			System.out.println("Ran test!");
			
		}
		//int to String:this one not a wrapper!
		int bal = 500;
		String b = String.valueOf(bal);//"500"
		System.out.println(b+30);
		
		//substring method:
		String mesg = "your oder id is 12345";
		String oderID = mesg.substring(mesg.indexOf("is")+3);
		System.out.println(oderID);
		String s = mesg.substring(0, 12);
		System.out.println(s);
		String s1 = mesg.substring(0, 5).trim();
		System.out.println(s1);
		
	
	
	}//return oderID

}
