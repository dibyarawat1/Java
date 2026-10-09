package Multithreading_concept;

public class MyThread  extends Thread{
      public void run(){
          for(int i = 1; i<= 1000; i++){
              System.out.println("child thread");
          }
          hello();
      }
      static void hello(){
          System.out.println("hello");
      }
}
