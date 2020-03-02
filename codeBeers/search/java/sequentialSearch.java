public class SearchTest
{

   public static int sequentialSearch(int[] elements, int target)
   {
      for (int j = 0; j < elements.length; j++)
      {
         if (elements[j] == target)
         {
            return j;
         }
     }
     return -1;
   }

   public static void main(String[] args)
   {
      int[] arr1 = {0,1,2,8,13,17,19,32,42};

      // test when the target is in the array
      int index = sequentialSearch(arr1, 8);
      System.out.println(index);
      index = sequentialSearch(arr1, 32);
      System.out.println(index);
   }
}