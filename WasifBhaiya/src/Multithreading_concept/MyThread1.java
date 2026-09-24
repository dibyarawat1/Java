package Multithreading_concept;

public class MyThread1  extends Thread{
       public   void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("My Thread1");
            }
        }
}
