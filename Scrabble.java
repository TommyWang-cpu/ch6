import java.util.Scanner;
public class Scrabble{

	public static void main(String[] args){
	
		System.out.println("Enter your word");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		
		System.out.println("Enter your tile");
		Scanner in2 = new Scanner(System.in);
		String tile = in2.nextLine();
		
		System.out.println(canSpell(word , tile));
	
	}

	public static boolean canSpell(String word,String tile){
		
		tile = tile.toLowerCase();
		word = word.toLowerCase();
		
		for(int i = 0; i < word.length(); i++){
			char c = word.charAt(i);
			int pos = -1;
		
		
			for(int ii = 0; ii < tile.length() && pos == -1; ii++){
				if(tile.charAt(ii) == c){
				pos = ii;
				}
				
			}
			if(pos == -1){
				return false;
			}
			tile = tile.substring(0,pos) + tile.substring(pos + 1);
		}
		return true;
	}

}
