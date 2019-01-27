public class TestDice 
{
	public static void main (String args[])
	{
		PairOfDice myDice = new PairOfDice();
		int[] theRoll = myDice.rollPair();
		System.out.println(theRoll);
	}
}
