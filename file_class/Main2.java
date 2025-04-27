package file_class;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

    public static void main(String[] args) {
        // file = an abstract representation of file and directory pathnames

        // File file = new File("file_class/output.txt"); // relative path

        // if(file.exists()) { // check if file exists
        //     System.out.println("That file exists!"); // if file exists
        //     System.out.println(file.getPath());
        //     System.out.println(file.getAbsolutePath()); // absolute path
        //     System.out.println(file.isFile());
        //     // file.delete();
        //     // System.out.println("File deleted");
        // } else { // if file does not exist
        //     System.out.println("That file does not exist!");
        // }

        // File writer 

        // try {
        //     FileWriter writer = new FileWriter("file_class/output2.txt");
        //     writer.write("Hello there\n");
        //     writer.write("Here is some text\n");
        //     writer.append("Appended text\n");
        //     writer.close();
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

        // File reader = read the content of a file as a stream of characters One character at a time
        //               read() returns an int value which contains the byte value of the next byte
        //               when read() returns -1, there is no more data to be read

        // try {
        //     FileReader reader =  new FileReader("file_class/output2.txt");
        //     int data = reader.read();
        //     while(data != -1) {
        //         System.out.print((char) data);
        //         data = reader.read();
        //     }
        //     reader.close();
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // } catch (IOException e) {
        //     // TODO Auto-generated catch block
        //     e.printStackTrace();
        // }

    }
    
}
