package homeWork5;

import java.io.File;
import java.io.FileFilter;

public class NewFilter implements FileFilter {

	private String[] acceptList;

	public NewFilter(String... string) {
		super();
		this.acceptList = string;
	}

	private boolean check(String extension) {
		for (String stringExt : acceptList) {
			if (stringExt.equals(extension)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean accept(File files) {
		int pointerIndex = files.getName().lastIndexOf(".");
		if (pointerIndex == -1) {
			return false;
		}
		String extension = files.getName().substring(pointerIndex + 1);
		return check(extension);
	}

}
