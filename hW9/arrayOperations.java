package hW9;

import java.util.*;

public class arrayOperations {

	private List<Integer> array;

	public arrayOperations(List<Integer> array) {
		super();
		this.array = array;
	}

	public static List<Integer> composeArray(List<Integer> array) {
		for (int i = 0; i < 10; i++) {
			array.add((int) (Math.random() * 10));
		}
		array.remove(0);
		array.remove(0);
		array.remove(array.size() - 1);
		return array;
	}

	public List<Integer> getArray() {
		return array;
	}

	public void setArray(List<Integer> array) {
		this.array = array;
	}

}
