package SimpleGame;

import java.util.Random;
import java.util.Scanner;

public class MainGame {
	public int systemRandomNum;
	public void getRandomNum(){
		Random ranNum = new Random(0);
		int randomNumber = ranNum.nextInt(2);
		this.systemRandomNum = randomNumber;
	}
	public String play(int userInput) {

		//Random number 0 is Rock, 1 is paper and 2 is scissors
		if(userInput == systemRandomNum) {
			return "Draw";
		}
		else if(systemRandomNum == 0 && userInput == 1){
			return "Congraduation, You Win";
		}
		else if(systemRandomNum == 0 && userInput == 2){
			return "No Luck, You Lose";
		}
		else if(systemRandomNum == 1 && userInput == 0){
			return "No Luck, You Lose";
		}
		else if(systemRandomNum == 1 && userInput == 2){
			return "Congraduation, You Win";
		}
		else if(systemRandomNum == 2 && userInput == 1){
			return "No Luck, You Lose";
		}
		else if(systemRandomNum == 2 && userInput == 0){
			return "Congraduation, You Win";
		}
		else {
			return "Error!";
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Rock Paper Scissors Game\n1. Rock \t 2.Paper\t 3.Sissor\nPlease enter number(1-3)");
		Scanner scan = new Scanner(System.in);
		int userInput = scan.nextInt();
		System.out.println("System Drawing...");
		userInput -= 1;
		MainGame newGame = new MainGame();
		newGame.getRandomNum();
		System.out.println(newGame.play(userInput));

	}

}
