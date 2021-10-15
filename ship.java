import java.util.Random;
import java.util.Scanner;

public class ship {
	int r,c;
	int counter=0;
	int[]shipPos=new int[5];

	public void setOnMap(int[][] z) {
		//int r,c;
		int counter=0;
		//int[]shipPos=new int[5];
		Random rand = new Random();
		//r=i,c=j;
		r=rand.nextInt(4);
		c=rand.nextInt(4);
		System.out.println(r); 
		System.out.println(c);
		int horv;
		horv=rand.nextInt(2);
		System.out.println(horv);
		if(horv==0) {
			if(c+2<4) {
			for(int j=c;j<c+3;j++) {
				z[r][j]=1;
				shipPos[counter]=r*10+j;
				counter++;
			}}
			else
				{for(int j=c;j>c-3;j--) {
					z[r][j]=1;
					shipPos[counter]=r*10+j;//to locate ship
					counter++;
				}}
		}//end of if (ship horizontal position
		else
		{
			if(r+2<4) {
				for(int i=r;i<r+3;i++) {
					z[i][c]=1;
					shipPos[counter]=c+i*10;
					counter++;
			}}
			else
			{for(int i=r;i>r-3;--i) {
				z[i][c]=1;
				shipPos[counter]=c+i*10;// to locate ship
				counter++;
			}
				
			}
		}//end of else ship in vertical position.
for(int i=0;i<3;i++) {		
System.out.println("shipsposition "+shipPos[i]);
}

	}//end of main

	public void play(int[][] z) {
		int shotx,shoty,c=0;
		Scanner Scanner=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			System.out.println("enter a cell to fire");
		shotx= Scanner.nextInt();
		shoty=Scanner.nextInt();
		if(z[shotx][shoty]==1) {
		System.out.println("hit");
		c++;
		z[shotx][shoty]=0;
		if(i>=10) {
			System.out.println("Game over");
		}
		else if(c==6) {
			System.out.println("both the ships sunk you won");
		    i=10;
		}
		}
		}
	}



}
