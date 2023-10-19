package string;

public class PangramExample {
public static void main(String[] args)
{
String s="the quick brown fox jumps over the lazy dog";
isPangram(s);
}
private static boolean isPangram(String s)
{
	if(s.length()<26)
	{
		return false;
	}
	else
	{
		for(char ch='a';ch<='z';ch++)
		{
			if(s.indexOf(ch)<0)
			{
				return false;
				
			}
		}}
	return true;
			}
		}
	


