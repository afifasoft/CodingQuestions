
public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Hello";
		String result = reverseWithStringBuilder(str);
		System.out.println("result: "+result);
		
		String res = reverseManually(str);
		System.out.println("reverse mannually: "+ res);
	}
	
	
	private static String reverseWithStringBuilder(String s) {
		
		return new StringBuilder(s).reverse().toString();
		
		
	}
	
	private static String reverseManually(String str) {
		StringBuilder sb = new StringBuilder();
		
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		
		return sb.toString();
	}

}
