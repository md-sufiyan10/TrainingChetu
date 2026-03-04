package multithreading;

class Task extends Thread{
    private StringBuffer sb;

    public Task(StringBuffer sb){
        this.sb=sb;
    }

    @Override
    public void run(){
        for(int i=1;i<=1000;i++){
            sb.append("a");
        }
    }
}

public class StringBufferTest {
    static void main() throws InterruptedException {
        StringBuffer sb=new StringBuffer("hello");
        Task t1=new Task(sb);
        Task t2=new Task(sb);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.print("string length: "+sb.length());
    }
}
