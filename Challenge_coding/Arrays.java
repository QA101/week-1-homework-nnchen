
public class Arrays {
	private static void printArray(int[] testArray2) {
	      for (int i = 0; i < testArray2.length; i++) {
	         if (i > 0) {
	            System.out.print(", ");
	         }
	         System.out.print(testArray2[i]);
	      }
	   }
	   public static void main(String[] args) {
	      int[] testArray = { 1,2,3,4};
	      int[] testArray2 = {4,3,2,1};
	      printArray(testArray);
	      System.out.println();
	      printArray(testArray2);
	      System.out.println();
	      
		
	}
}
	