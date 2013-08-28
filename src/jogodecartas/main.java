package jogodecartas;

import java.util.*;


public class main {

	
	String descarte;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] cartas = {"AP","AO","AC","AE","2P","2O","2C",
				"2E","3P","3O","3C","3E","4P","4O","4C",
				"4E","5P","5O","5C","5E","6P","6O","6C",
				"6E","7P","7O","7C","7E","8P","8O","8C",
				"8E","9P","9O","9C","9E","XP","XO","XC",
				"XE","JP","JO","JC","JE","QP",
				"DO","QC","QE","KP","KO","KC","KE"};

			
		Collections.shuffle(Arrays.asList(cartas));
		
		
		Stack<String>  baralho = new Stack<String>();
		
		
		
		
		for (int i = 0; i < 52; i++) {
			baralho.push(cartas[i]);
		}
		
		
		for (int i = 0; i < 52; i++) {
			System.out.println(baralho.pop());
		}
		
				
		
		
	}

}
