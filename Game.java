import java.util.Scanner;
public class Game 
{
	public static void main(String args[])
	{
		//scanner
		Scanner in=new Scanner(System.in);
		
		//score variables
		int wins=0;
		int losses=0;
		
		//looping for prompt
		while(true)
		{
			System.out.println("Enter your answer. Type rock, paper, or scissors:\nEnter x for quitting the game!");
			String myMove=in.nextLine();
			
			//check exit
			if (myMove.equals("x"))
			{
				break;
			}
			
			
			
			//myMove verification
			if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors"))
			{
				System.out.println("Invalid move!");
			}
			else
			{
				//computer move
				
				int rand=(int)(Math.random()*3);
				String opponnentMove="";
				if(rand == 0)
				{
					opponnentMove="rock";
				}
				else if(rand==1)
				{
					opponnentMove="paper";
				}
				else
				{
					opponnentMove="scissors";
				}
				System.out.println("Computer move: "+opponnentMove);
				
				//results
				if(myMove.equals(opponnentMove))
				{
					System.out.println("Tie!");
				}
				else if((myMove.equals("rock") && opponnentMove.equals("scissors"))||(myMove.equals("scissors") && opponnentMove.equals("paper"))||(myMove.equals("paper") && opponnentMove.equals("rock")))
						{
							System.out.println("YAY! You win!");
							wins++;
						}
				else
				{
					System.out.println("You lost! :(");
					losses++;
				}
			}
			//score
			System.out.println("\t Scoreboard \t");
			System.out.println("\t You have won \t"+wins);
			System.out.println("\t You have lost \t"+losses);
			
			
		}
		if(wins>losses)
		{
			System.out.println("Wohoo! You won more games!");
		}
		else if(wins<losses)
		{
			System.out.println("AWW! You lost more games!");
		}
		else
		{
			System.out.println("You lost & won same no. of games!");
		}
		System.out.println("Thanks for playing! Bye! :D");

	}
		}
			
		
		