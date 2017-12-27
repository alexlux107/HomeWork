package hW10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Map<String, String> dictionary = new HashMap<>();

	public Dictionary(Map<String, String> dictionary) {
		super();
		this.dictionary = dictionary;
	}

	public Map<String, String> getDictionary() {
		return dictionary;
	}

	public void setDictionary(Map<String, String> dictionary) {
		this.dictionary = dictionary;
	}

	public void addNewTranslate() {
		String english;
		String ukrainian;
		try (Scanner input = new Scanner(System.in)) {
			while (true) {
				System.out.println("Enter 'exit' if you dont write word");
				System.out.println("Enter english word: ");
				english = input.nextLine();
				if (english.equalsIgnoreCase("exit")) {
					break;
				} 
				System.out.println("Enter ukrainian translation: ");
				ukrainian = input.nextLine();
				this.dictionary.put(english, ukrainian);
				System.out.println("Enter 'exit' if you dont write word");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveToFile(File out) {
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(out))) {
			os.writeObject(this.dictionary);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void readFromFile(File in) {
		try (ObjectInputStream oi = new ObjectInputStream(new FileInputStream(in))) {
			this.dictionary = (Map)oi.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
