import java.util.*;
import java.util.Random;
import java.util.Scanner;
class Game{
	public int num,inputNumber,noOfGuesses = 0;
	Game()
	{
		Random ran = new Random();
		num = ran.nextInt(10);
	}
	void takeUserInput(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your guess? \n");
		inputNumber = sc.nextInt();
	}
	
	public int getNoOfGuesses(){
		return noOfGuesses;
	}
	
	public void setNoOfGuesses(int noOfGuesses){
		noOfGuesses = noOfGuesses;
	}

	boolean isCorrectNumber(){
		noOfGuesses++;
		if(inputNumber==num){
			System.out.format("Congo! you guessed it right, it was %d\n You guessed it in %d attempts", num, noOfGuesses);
			return true;
		}
		else if(inputNumber<num){
			System.out.println("Too less...");
		}
		else if(inputNumber>num){
			System.out.println("Too High...");
		}
		return false;
	}
}
public class GuesstheNumber
{
		public static void main(String[] args){
		Game g = new Game();
		boolean b = false;
		while(!b){
			g.takeUserInput();
			b = g.isCorrectNumber();
			System.out.println(b);
		}
	}	
}

	
	
		
		