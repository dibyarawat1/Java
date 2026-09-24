package Multithreading_concept;

public class MyThread2 implements Runnable{
         public void run(){
             for(int i = 0 ; i<1000; i++){
                 System.out.println("MyThread2");
             }
         }
}
