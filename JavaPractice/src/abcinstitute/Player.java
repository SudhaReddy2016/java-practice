package abcinstitute;

import java.util.Scanner;

public class Player {
	
	public int pnum;
	
	public int guessNum(){
		System.out.println("player,guess a Num");
		Scanner scan=new Scanner(System.in);
		pnum = scan.nextInt();
		return pnum;
	}

}
