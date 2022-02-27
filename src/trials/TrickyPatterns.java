package trials;

public class TrickyPatterns {

	public static void main(String[] args) {
		
		//Pattern 1
	       int n = 5;
	       for(int a = 1; a <= n; a++){      //a=row
	         for(int b = 1; b <= n; b++){         
	              for(int c = 1; c <= n; c++){      //stars+points in every r and col
	                if(a == c){
	                    System.out.print("*");
	                }else{
	                    System.out.print(".");
	            }
	         }
	         }
	         System.out.println();
	      }
	    System.out.println("______________________________");

	    //-----------------------------------
	    
	    //Pattern 2
	    System.out.println("\n~PATTERN 2~\n");
	     int m=8;
	     for(int d = 4; d <= m; d++){        
	        for(int e = m-d; e > 0 ;e--){  //empty parts at the beginning of the rows
	             System.out.print(" ");
	        }
	        for(int f = 1; f < 4;f++){     //JAVA words + points
	           for(int g = 1; g <4; g++){
	                if(  d%2==1 || !(g%2==0) ){
	                     System.out.print("  . ");
	                }else{
	                    System.out.print("JAVA");
	                }
	       }
	       }
	        System.out.println();
	    }
	        System.out.println("______________________________");

	    //------------------------------
	    
	    //Pattern 3
	    System.out.println("\n~PATTERN 3~\n");
	     int l=8;
	     for(int i = 3;i <= l; i++){        //i=3 =>it seems trapezoid
	        for(int j = l-i; j > 0;j--){  //l-i  empty parts
	            System.out.print(" ");
	      }
	        for(int p = 1; p < l/2;p++){   //l/2 = number of __| minus 1(p=1)
	            System.out.print("__|");
	       }
	        for(int k = 1;k <= i;k++){
	            System.out.print("* ");
	      }
	        for(int u = 1; u <l/2;u++){   
	            System.out.print("|__");
	      }
	      System.out.println();
	    }
	        System.out.println("______________________________");

	    //---------------------------------
	    
	    //Pattern 4
	    System.out.println("\n~PATTERN 4~\n");
	     int y = 7;
	     for(int s = 1; s <= y; s++){
	         for(int r = 1; r <= y; r++){
	             if(  s%2==1 || !(r%2==0) ){   //b!=4 && b!=8||a==3 || b==3 || b!=4
	               System.out.print(" o");
	            }else{
	               System.out.print("  ");
	            }
	         }
	         System.out.println();
	      }
	          System.out.println("______________________________");
	          System.out.println("THE END :)");

	    //-------------------------------
	    
		}
	}

	


