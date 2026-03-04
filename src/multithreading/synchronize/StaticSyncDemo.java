package multithreading.synchronize;


class Display{
    public static synchronized void show(String msg){
        for(int i=0; i<3 ;i++){
            System.out.println(msg);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class StaticSyncDemo {
    static void main() {

    Thread t1=new Thread(()->Display.show("Hello"));
    Thread t2=new Thread(()->Display.show("World"));
    t1.start();
    t2.start();
    }
}
