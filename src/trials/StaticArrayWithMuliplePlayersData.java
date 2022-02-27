package trials;

public class StaticArrayWithMuliplePlayersData {

	public static void main(String[] args) {
		
		String emp[] = new String[1];
		emp[0] = "Marta";
		int empage[] = new int[1];
		empage[0] = 26;
		String empteam[] = new String[1];
		empteam[0] = "Vytis";
		int empdob[] = new int[1];
		empdob[0] = 1993;
		boolean empgender[] = new boolean[1];
		empgender[0] = "F"!=null;
		double empstrikerate[] = new double[1];
		empstrikerate[0] = 116.8;
		
		System.out.println("Name : " + emp[0]);
		System.out.println("Age : " + empage[0]);
		System.out.println("Team : " + empteam[0]);
		System.out.println("DOB : " + empdob[0]);
		System.out.println("Gender : " + empgender[0] );
		System.out.println("Strike rate : " + empstrikerate[0]);
		System.out.println("************************************");
		
		        Object player1[] = new Object[6];
		        player1[0] = "Jolita";
		        player1[1] = 28;
				player1[2] = "Rollers";
				player1[3] = 1998;
				player1[4] = "Female";
				player1[5] =134.60;
		
				Object player2[] = new Object[6];
		        player2[0] = "Asta";
		        player2[1] = 25;
				player2[2] = "Nasionals";
				player2[3] = 1989;
				player2[4] = "Female";
				player2[5] =149.75;
				
				Object player3[] = new Object[6];
		        player3[0] = "Lolita";
		        player3[1] = 30;
				player3[2] = "Myteam";
				player3[3] = 1992;
				player3[4] = "Female";
				player3[5] =156.55;
				
				for(int counter = 0; counter<player1.length; counter++) {
					System.out.println("Player log is : " + player1[counter]);
				}
				System.out.println("***************************************");
				for(int counter = 0; counter<player2.length; counter++) {
					System.out.println("Player log is : " + player3[counter]);
				}
				System.out.println("***************************************");
				for(int counter = 0; counter<player3.length; counter++) {
					System.out.println("Player log is : " + player3[counter]);
				}
				System.out.println("***************************************");
				for(int i = player1.length-1; i>=0; i--) {
					System.out.println("Reverse player log is : " + player1[i]);
				}
		

	}

}
