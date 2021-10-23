
public class mainclass {

	public static void main(String[] args) {
		int countFor2=0;
		int[][] z= new int[5][5];
	ship a = new ship();
	ship b = new ship();
	//ship c = new ship();
	//creating map
	/*for(int i=0;i<4;i++)
		for(int j=0;j<4;j++) {
			z[i][j]=0;
		}*/
	do {
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++) {
				z[i][j]=0;
			}
	a.setOnMap(z);
	b.setOnMap(z);
	countFor2=0;
	for(int i=0;i<4;i++) 
		for(int j=0;j<4;j++) {
		if(z[i][j]==1)
			countFor2++;
		}
	System.out.println("count "+countFor2);
	}while(countFor2!=6) ;//end of do while
	//b.setOnMap(z);

	//c.setOnMap();
	System.out.println("array from main method");
	for(int i=0;i<4;i++) {
		System.out.println();
		for(int j=0;j<4;j++) {
			System.out.print(z[i][j]+" ");
		}

	}
	System.out.println();
	a.play(z);
	//b.play(z); // player 2
	}//main method
	

}
