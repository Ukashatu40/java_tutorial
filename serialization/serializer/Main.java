package serialization.serializer;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Serialization = the process of converting an object into a byte stream
        // Deserialization = the process of converting a byte stream into an object
        // the byte stream created is platform independent

        //                  Steps to Serialize 
        //                  --------------------------------------------------------------------
        //                  1. Make sure the class implements Serializable interface
        //                  2. add import java.io.Serializable;
        //                  3. Create a FileOutputStream FileOutputStream fileOut = new FileOutputStream(file path);
        //                  4. Create an ObjectOutputStream ObjectOutputStream out = new ObjectOutputStream(fileOut);
        //                  5. out.writeObject(objectName);
        //                  6. out.close(); fileOut.close();
        //                  --------------------------------------------------------------------

        User user = new User();

        user.name = "Ukasha";
        user.password = "password";

        FileOutputStream fileOut = new FileOutputStream("serialization/serializer/UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("Object has been serialized");

        long serialVersionUID = ObjectStreamClass.lookup(User.class).getSerialVersionUID();
        System.out.println("SerialVersionUID: " + serialVersionUID);
    }
}
