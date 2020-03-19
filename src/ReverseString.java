
public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Hello";
		String result = reverseString(str);
		System.out.println("result: "+result);
	}
	
	
	public static String reverseString(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		
		return sb.toString();
	}

}
