import java.util.Scanner;
public class Doubloon{

	public static void main(String[] args){
		System.out.println("Enter your word");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		System.out.println(isDoubloon(word));
	}
	
	public static boolean isDoubloon(String str){
		
		String word = str.toLowerCase();
		int len = word.length();
		if (len <= 1){
			return false;
		}
		for(int i = 0; i < len; i++){
			char a = word.charAt(i);
			int b = 0;
			
			for(int c = 0; c < len; c++){
				if(a == word.charAt(c)){
					b++;
				}
				if (b == 2){
					return true;
				} 
			}
		}
		return false;
	}
	
}
