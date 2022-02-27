package trials;

public class StarPatern {

	public static void main(String[] args) {
		

int[] in= {4, 1, 7, 9, 10, 11, 11};

        
        
        for(int i=0;i<in.length;i++)
        for(int j=0;j<in.length;j++)
        if(in[i]>in[j]) //key for sorting array
        {
            int t=in[i];
            in[i]=in[j];
            in[j]=t;
        }
        int n=1;
        while(in[n]==in[n-1]) n++;
    System.out.println("Second highest value: "+in[n]);
        
      
        System.out.println();
        int size=4;
        for(int i=0;i<size;i++){
        for(int j=0;j<=i;j++)
        System.out.print("*");
        System.out.println();}
        
      System.out.println("\ninverting 1 to 0, 0 to 1");
        int param=1;
        param=(param+1)%2;
        System.out.println(param^1);
        param=(param+1)%2;
        System.out.println(param^1);
        
     //swim logic. This is actually what they expext;
        System.out.println(param=param^1);
        System.out.println(param=param^1);
 
	}

}
