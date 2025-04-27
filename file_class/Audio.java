package file_class;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class Audio {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);

        File file = new File("file_class/Silent Night - The Soundlings.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);

        String response = "";
        
        while (!response.equals("Q")) {
            System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
            System.out.println("Enter your choice: ");
            
            response = scanner.next();
            response = response.toUpperCase();

            switch (response) {
                case ("P"): clip.start();
                break;
                case ("S"): clip.stop();
                break;
                case ("R"): clip.setMicrosecondPosition(0);
                break;
                case ("Q"): clip.close();
                break;
                default: System.out.println("Invalid Choice");
                break;
            }
        }



    }
}
