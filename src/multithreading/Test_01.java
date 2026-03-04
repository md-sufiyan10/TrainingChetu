package multithreading;

class MyThread7 extends Thread{
}
public class Test_01 {
    static void main() {

        Thread t = new Thread(() -> {
            for(int i=0;i<3;i++)
                System.out.print(i);
        });
        t.start();
        System.out.print("A");


    }
}
