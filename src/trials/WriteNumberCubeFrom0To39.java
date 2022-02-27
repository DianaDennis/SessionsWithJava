package trials;

public class WriteNumberCubeFrom0To39 {
/*
 * 00	01	02	03	04	05	06	07	08	09	
10	11	12	13	14	15	16	17	18	19	
20	21	22	23	24	25	26	27	28	29	
30	31	32	33	34	35	36	37	38	39	
40	41	42	43	44	45	46	47	48	49	
50	51	52	53	54	55	56	57	58	59	
60	61	62	63	64	65	66	67	68	69	
70	71	72	73	74	75	76	77	78	79	
generic way parameterize colnum,rawnum!!!!
 */
	
	public void genericNumcube(int numRaw, int colNum) {
		//numRaw = 8;
		//colNum = 9;
		System.out.println("*****************************************************");
		for(int i = 0; i<numRaw;i++) {
			for(int j =0; j <=colNum; j++) {
				System.out.print(i+""+j+"\t");
				
			}
			System.out.println();
			
		}
			
		}
	public void reversegenericNumcube(int numRaw, int colNum) {
		System.out.println("*******************************************************");
		for(int i=numRaw;i>=0;i--) {
			for(int j = colNum;j >=0;j--) {
				System.out.print(i+""+j+"\t");
			}
			System.out.println();
			
		}
		
	}

	
	
	public static void main(String[] args) {
		
		WriteNumberCubeFrom0To39 genericCubeNumber = new WriteNumberCubeFrom0To39();
		genericCubeNumber.genericNumcube(7, 7);
		genericCubeNumber.reversegenericNumcube(5, 8);
		
		for(int i = 0;i < 8;i++) {//8 number indicates raws
			for(int j =0; j <= 9; j++) {//9 indicates colums
				System.out.print(i+""+j+"\t");
			}
			System.out.println();
		}
		
		}

}
