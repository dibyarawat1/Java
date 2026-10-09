package Multithreading_concept;
public class Multithreading {
    static void main() {
//        MyThread mt = new MyThread();
//        mt.start();
//        MyThread1 m = new MyThread1();
//        m.start();
        MyThread2 mt2 = new MyThread2();
        Thread t = new Thread(() ->{
            for(int i = 1; i<=1000; i++){
                System.out.println("child class");
            }
        });
        t.start();
        for(int i = 0 ;i< 1000; i++){
            System.out.println("main thread");
        }
    }
}
