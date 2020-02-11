import java.util.*;
public class DistinctPalindrom
{
  private static boolean isPalindrome (String input)
  {
    StringBuilder plain = new StringBuilder (input);
    StringBuilder reverse = plain.reverse ();
      return (reverse.toString ()).equals (input);
  }

  public static void findAllPalindromesUsingBruteForceApproach (String input)
  {
    Set < String > palindromes = new HashSet <> ();
    for (int i = 0; i < input.length (); i++)
      {
	for (int j = i + 1; j <= input.length (); j++)
	  {
	    if (isPalindrome (input.substring (i, j)))
	      {
		palindromes.add (input.substring (i, j));
	      }
	  }
      }
    System.out.println (palindromes);
  }

  public static void main (String[]args)
  {
      findAllPalindromesUsingBruteForceApproach("abaaa");
  }
}
