package hW9;

import java.util.*;

public class Drink {
	
	static ArrayDeque<Drinker> drinkers = new ArrayDeque<>();

	public Drink(ArrayDeque<Drinker> drinkers) {
		super();
		Drink.drinkers = drinkers;
	}

	public ArrayDeque<Drinker> getDrinkers() {
		return drinkers;
	}

	public void setDrinkers(ArrayDeque<Drinker> drinkers) {
		Drink.drinkers = drinkers;
	}
	
	public static void addDrinker(Drinker drinker) {
		drinkers.add(drinker);
	}
	
	public static ArrayDeque<Drinker> doubleCola(int drinks){
        for(int i =0; i < drinks; i++){
        	Drinker drinker = drinkers.removeFirst();
        	drinkers.addLast(drinker);
        	drinkers.addLast(drinker);
        }
        return drinkers;
    }

}
