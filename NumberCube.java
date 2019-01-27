public class NumberCube 
{
	public static final int DEFAULT_SIDES = 6;
	public static final int MINIMUM_SIDES = 4;
	public static final int MAXIMUM_SIDES = 37;
	/*final = constant in program, value doesn't change
	constants in java are always in all caps
	are static because it's a default value which applies to the entire class (each cube doesn't gets its own side count)
	*/
	private int sides;
	
	public NumberCube()
	{
		sides = DEFAULT_SIDES;
	}
	
	public NumberCube(int numOfSides)
	{
		if(numOfSides < MINIMUM_SIDES || numOfSides > MAXIMUM_SIDES)
			sides = DEFAULT_SIDES;
		else
			sides = numOfSides;
	}
	
	public int roll()
	{
		return (int)(Math.random() * sides) + 1;
	}
	
	
}
