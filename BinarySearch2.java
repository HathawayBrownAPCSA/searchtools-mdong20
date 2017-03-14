import java.util.*;

public class BinarySearch2
{
  /** Search for target in data.
    * PRECONDITION:  data is in ascending order!
    * If found, return the index of target.
    * If not found, return -1
    */
  public static int findNum (ArrayList<Integer> data, int target)
  {
    return -1;
  }
  
  /** Search for target in data.
    * PRECONDITION:  data is in ascending order!
    * If found, return the index of target.
    * If not found, return -1
    */
  public static int findString (ArrayList<String> data, String target)
  {
    return -1;
  }
  
  
  public static void main (String[] args)
  {
    // Integer search
    // initialize ArrayList
    ArrayList<Integer> numList = new ArrayList<Integer>(6);
    numList.add(10);    numList.add(12);    numList.add(16);
    numList.add(32);    numList.add(47);    numList.add(93);
    int goal = 10;
    
    // print List
    for (int i : numList) 
      System.out.print (i + "  ");  
    System.out.println();
    
    // Search for goal, report on result.
    int index = findNum(numList, goal);
    if (index >= 0)
      System.out.println (goal + " found in ArrayList at position " + index);
    else
      System.out.println (goal + " not found in ArrayList.");
    
    
    // String search
    // initialize array
    ArrayList<String> names = new ArrayList<String>(17);
    names.add("Alison");  names.add("Amanda");  names.add("Andrew");   names.add("Anna");  
    names.add("Coco");  names.add("Colby");  names.add("Fiona");
    names.add("Hannah");  names.add("Jennifer");  names.add("Kate"); names.add("Kathy"); 
    names.add("Leah");    names.add("Lexi");  names.add("Megan");  names.add("Michelle"); 
    names.add("Sara");   names.add("Savana");
    String findMe = "Bubba";
    
    // print array
    for (String s : names) 
      System.out.print (s + "  ");  
    System.out.println();
    
    // Search for goal, report on result.
    index = findString(names, findMe);
    if (index >= 0)
      System.out.println (findMe + " found in array at position " + index);
    else
      System.out.println (findMe + " not found in array.");
    
  }
}