package timertask;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        // TimerTask is a task that can be scheduled for one-time or repeated execution by a Timer
        // TimerTask is an abstract class that implements Runnable interface
        // TimerTask is designed to be run by a Timer

        // Timer = a facility for threads to schedule tasks for future execution in a background thread

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            int counter = 10;
            @Override
            public void run() {
                if(counter > 0){
                    System.out.println(counter + " seconds have passed");
                    counter--;
                } else {
                    System.out.println("Time's up!");
                    timer.cancel();
                }
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2025);
        date.set(Calendar.MONTH, Calendar.JANUARY);
        date.set(Calendar.DAY_OF_MONTH, 14);
        date.set(Calendar.HOUR, 0);
        date.set(Calendar.MINUTE, 51);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);

        // timer.schedule(task, date.getTime());
        // timer.schedule(task, 3000);
        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
