package serialization.deserializer;



import java.io.Serializable;

public class User implements Serializable{

    private static final long serialVersionUID = 1;

    String name;
    transient String password; // transient fields are not serialized

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

}
