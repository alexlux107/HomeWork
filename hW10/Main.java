package hW10;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Map<String, String> dictMap = new HashMap<>();
        File fileDictionary = new File("English.txt");
        Dictionary dictionary = new Dictionary(dictMap);
        dictionary.addNewTranslate(); 
        Translate translate =  new Translate(dictionary);
        translate.translate(fileDictionary);

	}

}
