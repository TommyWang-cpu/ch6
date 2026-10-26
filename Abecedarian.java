import java.util.Scanner;
public class Abecedarian{
	public static void main (String[] args){
		System.out.println("Enter your word");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		System.out.println(isAbecedarian(word));
	}
	
	 public static boolean isAbecedarian(String str){
		int len = str.length();
		if (len <= 1){
			return true;
		}
		for(int i = 1; i < len; i++){
			if (str.charAt(i) < str.charAt(i-1)){
				return false;
			} 
		}
		return true;
	 }
	 
}

