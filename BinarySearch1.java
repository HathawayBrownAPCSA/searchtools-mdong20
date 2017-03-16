public class BinarySearch1
{
  /** Search for target in data.
    * PRECONDITION:  data is in ascending order!
    * If found, return the index of target.
    * If not found, return -1
    */
  public static int findNum (int[] data, int target)
  {
    int first = 0;
    int last = data.length - 1;
    
    while (first <= last)
    {
      int middle = (first + last) / 2;
      
      if (data[middle] == target)
        return middle;
      else if (data[middle] < target)
        first = middle + 1;
      else 
        last = middle - 1;
    }
    return -1;
  }
  
  /** Search for target in data.
    * PRECONDITION:  data is in ascending order!
    * If found, return the index of target.
    * If not found, return -1
    */
  public static int findString (String[] data, String target)
  {
    int first = 0;
    int last = data.length - 1; 
    
    while (first <= last)
    {
      int middle = (first + last) / 2;
      
      if (data[middle].compareTo(target) == 0)
        return middle;
      else if (data[middle].compareTo(target) < 0)
        first = middle + 1;
      else 
        last = middle - 1;      
    }   
    return -1;
 
  }
  
  
  public static void main (String[] args)
  {
    // Integer search
    // initialize array
    int[] numbers = {4, 7, 19, 23, 31, 47};
    int goal = 47;
    
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
    String[] names = {"Alison", "Amanda", "Andrew", "Anna", "Coco", "Colby", "Fiona", "Hannah", "Jennifer", 
      "Kate", "Kathy", "Leah", "Lexi", "Megan", "Michelle", "Sara", "Savana" };
    String findMe = "Michelle";
    
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
