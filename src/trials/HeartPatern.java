package trials;

import java.util.Scanner;

public class HeartPatern {
	
	/*
	 * Your name in little hearts 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		  String name = scan.nextLine();
		    String[] words = name.split("");
		    int row;
		    int col;
		    int length;
		    int i;
		    i = 0;
		    length = name.length();
		    while(i<length){
		    for(row=0;row<6;row++){
		      for(col=0;col<7;col++){
		          if((row==0 && col%3 != 0) || (row==1 && col%3 ==0) || (row-col == 2) || (row+col ==8)){
		              System.out.print("*");
		          }else if(row == 2 && col == 3){
		              System.out.print(words[i]);
		          }else{
		              System.out.print(" ");
		          }
		      }; 
		      System.out.println();
		    };
		    System.out.println();
		    i = i+1;
		    };
		   
	}

}
