package serialization.serializer;



import java.io.Serializable;

public class User implements Serializable{

    String name;
    transient String password; // transient fields are not serialized

    public void Greetings() {
        System.out.println("Hello, my name is " + name);
    }

}
