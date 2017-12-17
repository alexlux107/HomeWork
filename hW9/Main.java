package hW9;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Integer> newList = new ArrayList<>();
		newList = arrayOperations.composeArray(newList);
		System.out.println(newList);
		
		Drinker sheldon = new Drinker("Sheldon");
		Drinker leonard = new Drinker("Leonard");
		Drinker volovitc = new Drinker("Volovitc");
		Drinker kutrapali = new Drinker("Kutrapali");
		Drinker penny = new Drinker("Penny");
		
		Drink.addDrinker(sheldon);
		Drink.addDrinker(leonard);
		Drink.addDrinker(volovitc); 
		Drink.addDrinker(kutrapali);
		Drink.addDrinker(penny);
		
		System.out.println(Drink.doubleCola(5));


	}

}
