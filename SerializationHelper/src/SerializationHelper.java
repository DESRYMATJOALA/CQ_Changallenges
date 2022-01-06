import java.io.*;
public class SerializationHelper{
    public static void serialiseToFile(String object,String filePath)throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        BufferedOutputStream objectOutputStream = new BufferedOutputStream(fileOutputStream);
        objectOutputStream.write(object.getBytes());
        objectOutputStream.close();
    }
    public static Object deserializeFromFile(String filePath)
            throws IOException, ClassCastException, ClassNotFoundException{
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        objectInputStream.close();
        return object;
    }
}
