package homeWork5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FileOperations {

	public static void fileCopy(File files, File filesTo) throws IOException {
		if (files == null || filesTo == null) {
			throw new IllegalArgumentException("Null file pointer");
		}

		try (InputStream is = new FileInputStream(files); OutputStream os = new FileOutputStream(filesTo)) {

			byte[] buffer = new byte[1024];
			int readBytes = 0;

			for (; (readBytes = is.read(buffer)) > 0;) {
				os.write(buffer, 0, readBytes);
			}
		} catch (IOException e) {
			throw e;
		}

	}
	public static void copyWords(File file1, File file2, File common){
        try(PrintWriter w = new PrintWriter(common)){
            Set<String> firstSet = wordsFromFile(file1);
            Set<String> secondSet = wordsFromFile(file2);
            secondSet.retainAll(firstSet);
            for (String str : secondSet)
               w.println(str);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static Set<String> wordsFromFile(File file){
        Set<String> set = null;
        try(BufferedReader r = new BufferedReader(new FileReader(file))){
            set = new HashSet<>();
            String buffer;
            while(true){
                buffer = r.readLine();
                if (buffer == null)
                    break;
                set.addAll(Arrays.asList(buffer.split(" ")));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return set;
    }
}