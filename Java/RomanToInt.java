import java.util.HashMap;
public class RomanToInt {

	

	public static void main(String[] args) {

		
		//Enter the Roman Symbol below in UpperCase..
		System.out.println(romanToInt("CII"));

	}

	 
		 final static HashMap<Character, Integer> ROMANMAP = new HashMap<>();
		    
		     static{
		        ROMANMAP.put('I', 1);
		        ROMANMAP.put('V', 5);
		        ROMANMAP.put('X', 10);
		        ROMANMAP.put('L', 50);
		        ROMANMAP.put('C', 100);
		        ROMANMAP.put('D', 500);
		        ROMANMAP.put('M', 1000);
		    }
	 

		     public static  int romanToInt(String s) {
		         int result = 0;
		         int prevValue = 0;
		         for (int i = s.length() - 1; i >= 0; i--) {
		             int currentValue = ROMANMAP.get(s.charAt(i));
		             if (currentValue >= prevValue) {
		                 result += currentValue;
		             } else {
		                 result -= currentValue;
		             }
		             prevValue = currentValue;
		         }
		         return result;
		     
	       
	 }	

	 }
	 
