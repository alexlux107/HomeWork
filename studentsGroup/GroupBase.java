package studentsGroup;

import java.io.*;

public class GroupBase {
	
    public GroupBase() {
    	super();
    }
	

    public static void saveToFile(Group group, File file){
            try (ObjectOutput os = new ObjectOutputStream(new FileOutputStream(file))) {
                os.writeObject(group);
            } catch (IOException e) {
            }
    }
    public static Group loadFromFile(File file){
        try(ObjectInput is = new ObjectInputStream(new FileInputStream(file))){
            return (Group) is.readObject();
        }catch (IOException | ClassNotFoundException | ClassCastException e){
            return null;
        }
    }

}
