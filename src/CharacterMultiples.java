/**
 * 
 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;

public class CharacterMultiples {
    
	public static final int MAX_ARRAY = 100000;
	public static int stringLength;
	public static int multiplesLength;
    public static int counter;
	
	public static String[] stringOfChars;
    public static int[] multiplesArray;
	public static ArrayList<Integer> actualMultipleCount = new ArrayList<Integer>();
    public static int [] characterCountArray;
    

	public static void main(String[] args){
		stringOfChars = getStringArray();
		System.out.println(Arrays.toString(stringOfChars));

		multiplesArray = getMultiplesArray();
		System.out.println(Arrays.toString(multiplesArray));
		
		stringLength = stringOfChars.length;
		multiplesLength = multiplesArray.length;
		
		System.out.println("String Length: " +stringLength);
		System.out.println("Multiples Length: " +multiplesLength); 	
		
		compareArrayLengths(stringLength, multiplesLength);
		countCharacters(stringOfChars, multiplesArray);
	}

	/**
	 * This method will be modified to accept input from the keyboard
	 */
	public static String[] getStringArray(){
		stringOfChars = new String[] {"aababcabcd","aababcabcd", "$$YUD99 996025NSOn doi%%%%"};
		return stringOfChars;
	}
	
	/**
	 * 
	 */
	public static int[] getMultiplesArray(){
		multiplesArray = new int[] {3, 2, 2};
		return multiplesArray;
	} 
	
	public static void compareArrayLengths(int stringLength, int multiplesLength){
		if (stringLength == 0 || multiplesLength == 0){
			System.out.println("One or both of your arrays are empty.");
			System.exit(0);
		}
		
		if (stringLength > MAX_ARRAY || multiplesLength > MAX_ARRAY){
			System.out.println("Your arrays exceed the maximum size.");
			System.exit(0);
		}
		
		if (stringLength != multiplesLength){
			System.out.println("The arrays contain unequal elements.");
			System.exit(0);
		}
	}
	
	public static void countCharacters(String[] strings, int[] nums) {
		int multiple = 0;
		String tempChars = "";
		
		for(int i = 0; i < stringLength; i++){
			multiple = multiplesArray[i];
			tempChars = stringOfChars[i];
		    Map<Character, Integer> charMap = new HashMap<Character, Integer>();	
			char[] stringToCharArray = tempChars.toCharArray();

		    for (char value: stringToCharArray) {

		    	if (Character.isLetterOrDigit(value) || Character.isSpaceChar(value) || Character.isDefined(value)) {
		           if (charMap.containsKey(value)) {
		               charMap.put(value, charMap.get(value) + 1);
		           } else {
		               charMap.put(value, 1);
		           }
		       }
		    }
		    System.out.println(charMap);
		    
		    int count = 0; 
		    for(Integer value: charMap.values()) {
		    	  if (value % multiple == 0) {
		    	    count++;
		    	  }
		    }
		    actualMultipleCount.add(count);
		}
	    System.out.println(actualMultipleCount);
	}
	
}
	

