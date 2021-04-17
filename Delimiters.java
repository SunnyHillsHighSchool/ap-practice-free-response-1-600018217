//AP Free Response Practice
//Johnathan Mitri
import java.util.*;

public class Delimiters
{
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}

	public ArrayList<String> getDelimitersList(String[] tokens)
  {
    //Create a new ArrayList to build the result with
    ArrayList<String> result = new ArrayList<String>();
    //Loop through each string in tokens
    for (String str: tokens)
    {
      //if the string is equal to the open or close delimiter
      if (str.equals(openDel) || str.equals(closeDel))
      {
        //add the string to the result 
        result.add(str);
      }
    }
    //return the result
    return result;
  }

	public boolean isBalanced(ArrayList<String> delimiters)
	{ 
    //declare openCount = 0
    int openCount = 0;
    //declare closeCount = 0
    int closeCount = 0;
    //for each string in the delimiters list
    for (String str: delimiters)
    {
      //if the string equals the open delimiter
      if (str.equals(openDel))
        //increment openCount
        openCount++;
      //if the string is not the open delimiter, meaning it must be the closed one
      else
        //increment closeCount
        closeCount++;
      //if closeCount is greater than openCount at any time
      if (closeCount > openCount)
        //return false
        return false;
    }
    //if openCount does not equal closeCount at the end
    if (openCount != closeCount)
      //return false
      return false;
      
    //return true
    return true;
	}
}