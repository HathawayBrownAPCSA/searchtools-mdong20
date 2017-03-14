public class LinearSearch1
{
  /** Search for target in data.
    * If found, return the index of target.
    * If not found, return -1
    */
  public static int findNum (int[] data, int target)
  {
    return -1;
  }
  
  /** Search for target in data.
   * If found, return the index of target.
   * If not found, return -1
   */
  public static int findString (String[] data, String target)
  {
    return -1;
  }
  
  
  public static void main (String[] args)
  {
    // Integer search
    // initialize array
    int[] numbers = {30, 18, 5, 9, 27, 42, 4};
    int goal = 10;
    
    // print array
    for (int i : numbers) 
      System.out.print (i + "  ");  
    System.out.println();
    
    // Search for goal, report on result.
    int index = findNum(numbers, goal);
    if (index >= 0)
      System.out.println (goal + " found in array at position " + index);
    else
      System.out.println (goal + " not found in array.");
    
    
    // String search
    // initialize array
    String[] names = {"Fiona", "Colby", "Sara", "Anna", "Michelle", "Kate", "Savana", "Hannah",
      "Lexi", "Andrew", "Coco", "Leah", "Megan", "Jennifer", "Kathy", "Alison", "Amanda"};
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