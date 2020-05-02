package abcinstitute;

public class Umpire {
	
	public int numFromGuesser;
	public int numFromPlayer1;
	public int numFromPlayer2;
	public int numFromPlayer3;
	
	public void collectNumFromGuesser(){
		Guesser g=new Guesser();
		
		numFromGuesser=g.gnum;
	}
	public void collectNumFromPlayer(){
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		numFromPlayer1=p1.pnum;
		numFromPlayer2=p2.pnum;
		numFromPlayer3=p3.pnum;	
	}
	public void compire(){
		if(numFromGuesser == numFromPlayer1){
			System.out.println("player1 has won the game");
		}
		else if(numFromGuesser == numFromPlayer2){
			System.out.println("player2 has won the game");
		}
		else if(numFromGuesser == numFromPlayer3){
			System.out.println("player3 has won the game");
		}
		else {
			System.out.println("Game lost!!! Try Again");
		}
	}

}
