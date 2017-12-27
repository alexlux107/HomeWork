package hW10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
 
public class Translate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Dictionary dictionary;

	public Translate(Dictionary dictionary) {
		super();
		this.dictionary = dictionary;
	}

	public Dictionary getDictionary() {
		return dictionary;
	}

	public void setDictionary(Dictionary dictionary) {
		this.dictionary = dictionary;
	}
	
	public void translate(File fileDictionary){
        if(fileDictionary == null){
            throw new IllegalArgumentException("File cannot be null");
        }
        String translate;
        StringBuilder sb = new StringBuilder();
        try(BufferedReader bfr = new BufferedReader(new FileReader(fileDictionary));
            BufferedWriter bfw = new BufferedWriter(new FileWriter("Ukrainian.txt"))){
            for(;(translate = bfr.readLine())!=null;){
                for (String word:translate.split("[ ]")) {
                    sb.append(dictionary.getDictionary().get(word)+" ");
                }
                sb.append(System.lineSeparator());
            }
            bfw.write(sb.toString());
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
