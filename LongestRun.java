
public class LongestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberCube theCube = new NumberCube();
		int[] theTosses = getCubeTosses(theCube, 11);
		printTosses(theTosses);
		getLongestRun(theTosses);
	}
	public static int[] getCubeTosses(NumberCube cube, int numTosses)
	{
		int[] rolls = new int[numTosses];
		for(int i = 0; i < numTosses; i++)
		{
			rolls[i] = cube.roll();
		}
		return rolls;
	}

	public static void printTosses(int[] tosses)
	{
		for (int i = 0; i < tosses.length; i++)
		{
			System.out.println("Toss [" + i + "]: " + tosses[i]);
		}
	}
	/*public static int getLongestRun(int[] values)
	{
		int[] runs = new int[0];
		int[] runsIndices = new int[0];
		int startingIdx = 0;
		int numCount = 0;
		int runsPosition = 0;
		int longestRun = 0;
		for (int k = 0; k < values.length;)
		{
			if(values[k] == values[k-1])
			{
				startingIdx = k-1;
				while(values[k] == values[k-1])
				{
					numCount++;
					k++;
				}
				runs[runsPosition] = numCount;
				runsIndices[runsPosition] = startingIdx;
				runsPosition++;
			}
			k++;	
		}
		for(int j = 0; j < runs.length; j++)
		{
			if(runs[j] > runs[j-1])
			{
				j = longestRun; //j will become index of runsIndices where the starting index of the longest run will be returned
			}
		}
		return runsIndices[longestRun];
	}
	*/
		//OFFICIAL AP ANSWER:
	public static int getLongestRun(int[] values)
	{
	    int lengthOfLongestRun = 1;
  		int startOfLongestRun = -1;
  		int lengthOfCurrentRun = 1;

  		for (int i = values.length - 1; i >= 0; i--)
  		{
    		if (values[i] == values[i + 1])
    		{
      			lengthOfCurrentRun++;
      			if(lengthOfCurrentRun > lengthOfLongestRun)
      			{
        			lengthOfLongestRun = lengthOfCurrentRun;
        			startOfLongestRun = i;
      			}
    		}
    		else
      			lengthOfCurrentRun = 0;
  		}
		System.out.println("um hi");
  		return startOfLongestRun;
	}
	
	/* CLASS ANSWER:
		int currentRun = 1; int longestRunSoFar = 1; 
		int startCurrentRun = 0; int startLongestRun = 0;
		int previous; int current;
		for (int i = 1; i < values.length; i++)
		{
			previous = values[i-1];
			current = values[i];
			if (current == previous)
			{
				currentRun++;
				previous = startCurrentRun; //he didnt have this; instead he put 'startOfCurrentRun = 0;' after the if statement under the else statement
			}
			else
			{
				if (currentRun > longestRunSoFar)
				{
					currentRun = longestRun;
					startCurrentRun = startLongestRun;
				}
				currentRun = 1;
			}
		}
		if (currentRun > longestRunSoFar)
		{
			//some stuff >:| idk
			 currentRun = longestRun;
			 startCurrentRun = startLongestRun;
		}
		
		return startLongestRun;
	
	
	
	
	 */
}
