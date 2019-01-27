
public class DiceRollOutcomes 
{
	private int numOfRolls;
	public static final int DEFAULT_ROLLS = 100;
	private int[] outcome;
	private PairOfDice myDice;
	
	public DiceRollOutcomes()
	{
		outcome = new int[DEFAULT_ROLLS];
		myDice = new PairOfDice();
		//will potentially store a hundred rolls for the dice
		for (int i = 0; i < outcome.length; i++)
		{
			outcome[i] = myDice.roll();
		}
	}
	public String toString()
	{
		for (int i = 0; i < outcome.length; i++)
		{
			theOutput = "";
			System.out.println("roll " + (i+1) + ": " + outcome[i]);
		}
	}
}
