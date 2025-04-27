package threads;

public class MyThread extends Thread{
    
    @Override
    public void run(){
        if(this.isDaemon()){
        System.out.println("this is a daemon thread running");
        } else{
            System.out.println("This is user thread running");
        }
    }
}
