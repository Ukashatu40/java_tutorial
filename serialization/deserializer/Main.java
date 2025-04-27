package serialization.deserializer;



import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // deserialization = the process of rebuilding an object from a sequence of bytes
        // the reverse of serialization
        // the process of deserialization is platform-independent
        // the class of the object, that is being deserialized, should be available in the classpath
        // the class should have

        //                  Steps to Deserialize
        //                  --------------------------------------------------------------------
        //                  1. Make sure the class implements Serializable interface
        //                  2. add import java.io.Serializable;
        //                  3. Create a FileInputStream FileInputStream fileIn = new FileInputStream(file path);
        //                  4. Create an ObjectInputStream ObjectInputStream in = new ObjectInputStream(fileIn);
        //                  5. objectName = (ClassName) in.readObject();
        //                  6. in.close(); fileIn.close();
        //                  --------------------------------------------------------------------

        // Important Notes   1. chidren  classes of a parent class that implements Serializable interface will do so automatically
        //                   2. static fields are not serialized (they belong to the class, not the object)
        //                   3. the class's definition (class file) itself is not recorded in the stream
        //                   4. the class's definition must be available to the JVM that is deserializing the object
        //                   5.  Fields that are marked as transient are not serialized
        //                   6.  The serialVersionUID of the class is recorded

        User user = null;

        
            FileInputStream fileIn = new FileInputStream("serialization/serializer/UserInfo.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            user = (User) in.readObject(); // cast to User
            in.close();
            fileIn.close();
            
            System.out.println(user.name);
            System.out.println(user.password);
            user.sayHello();
       
    }
}
