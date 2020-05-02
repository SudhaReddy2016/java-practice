package abcinstitute;

import java.util.Scanner;

public class Guesser {
	
	public int gnum;

	public int guessNum(){
		System.out.println("guesser,guess a Num");
		Scanner scan=new Scanner(System.in);
		gnum = scan.nextInt();
		return gnum;
	}
}
