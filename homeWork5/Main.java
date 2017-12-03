package homeWork5;

import java.io.File;
import java.io.IOException;

import homeWork5.FileOperations;

public class Main {

	public static void main(String[] args) {
		
		File firstSourceFile = new File("D:\\Java_test\\From\\Test1.txt");
        File secondSourceFile = new File("D:\\Java_test\\From\\Test1.txt");
        File genericFile = new File("D:\\Java_test\\From\\Test3.txt");
        FileOperations.copyWords(firstSourceFile, secondSourceFile, genericFile);
        
		File folderFrom = new File("D:\\Java_test\\From");
		NewFilter filter = new NewFilter("txt");
		File fileList[] = folderFrom.listFiles(filter);
        for(File files : fileList){
            try{
            	File filesTo = new File("D:\\Java_test\\To\\" + files.getName()); 
                FileOperations.fileCopy(files, filesTo);   
            }catch (IOException e){
                e.printStackTrace();
            }
        }

	}
}
