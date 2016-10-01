/**
 * @author Jess Rudolph
 * 
 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;


/**
 * Generates 2 parallel arrays: a string array and an int array. 
 * The string array contains strings of characters, symbols, 
 * numbers, and punctuation, while the int array provides an 
 * integer that represents a multiple of characters in the 
 * corresponding string. The output is an integer array that 
 * counts the number of unique characters of a string that 
 * are a multiple of the multiple integer that was input.
 *
 */
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
		
		//System.out.println("String Length: " +stringLength);
		//System.out.println("Multiples Length: " +multiplesLength); 	
		
		compareArrayLengths(stringLength, multiplesLength);
		countCharacters(stringOfChars, multiplesArray);
	    System.out.println(actualMultipleCount);
	}

	/**
	 * @return the string array
	 */
	public static String[] getStringArray(){
		stringOfChars = new String[] {"aababcabcd","aababcabcd", "$$YUD99 996025NSOn doi%%%%"};
		return stringOfChars;
	}
	
	/**
	 * @return the integer array of multiples
	 */
	public static int[] getMultiplesArray(){
		multiplesArray = new int[] {3, 2, 2};
		return multiplesArray;
	} 
	
	/**
	 * Compare the lengths of the integer array and the string array.
	 * Ensure that the arrays are not null.
	 * Ensure that the arrays have the same number of indices.
	 * Ensure that the length of the arrays does not exceed 100,000 indices. 
	 * 
	 * @param stringLength		the length of the string array
	 * @param multiplesLength	the length of the int array
	 */
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
	

	/**
	 * Counts the number of occurrences of each unique character in the string at multiplesArray[i].
	 * If the number of occurrences is a multiple of the number entered in multiplesArray[i],
	 * it is added to the count in the integer array.
	 * 
	 * @param stringOfChars		the string array 
	 * @param multiplesArray	the multiple array 
	 * @return					the ArrayList of integers for the number of times a character
	 * 							in string, multiplesArray[i], was a multiple of the integer
	 * 							in the corresponding multiplesArray.
	 */
	public static ArrayList<Integer> countCharacters(String[] stringOfChars, int[] multiplesArray) {
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
	    return actualMultipleCount;
	}
	
}
	

