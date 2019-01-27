
public class PairOfDice 
{
	//create object that's built from other objects
	private NumberCube die1;
	private NumberCube die2;
	
	public PairOfDice()
	{
		die1 = new NumberCube();
		die2 = new NumberCube();
	}
	
	public int[] rollPair()
	{
		//return (int)(Math.random() * sides) + 1;
		int[] rollVals = new int[2];
		rollVals[1] = die1.roll();
		rollVals[2] = die2.roll();
		return rollVals;
	}
}
