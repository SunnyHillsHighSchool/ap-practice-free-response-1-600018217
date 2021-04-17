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
    ArrayList<String> result = new ArrayList<String>();
    for (String str: tokens)
    {
      if (str.equals(openDel) || str.equals(closeDel))
        result.add(str);
    }
    return result;
  }

	public boolean isBalanced(ArrayList<String> delimiters)
	{ 
    int openCount = 0;
    int closeCount = 0;
    for (String str: delimiters)
    {
      if (str.equals(openDel))
        openCount++;
      else
        closeCount++;
      if (closeCount > openCount)
        return false;
    }
    if (openCount != closeCount)
      return false;

    return true;
	}
}