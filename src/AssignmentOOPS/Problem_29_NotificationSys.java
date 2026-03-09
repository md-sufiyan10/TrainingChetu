package AssignmentOOPS;

// Q29: Notification System

interface Notifiable {
    void sendNotification();
}

class EmailNotifier implements Notifiable {
    @Override
    public void sendNotification() {
        System.out.println("Sending notification via Email.");
    }
}

class SMSNotifier implements Notifiable {
    @Override
    public void sendNotification() {
        System.out.println("Sending notification via SMS.");
    }
}
public class Problem_29_NotificationSys {
     static void main(String[] args) {
        Notifiable n1 = new EmailNotifier();
        Notifiable n2 = new SMSNotifier();

        n1.sendNotification();
        n2.sendNotification();
         System.out.println("---------------------");

        Notifiable[] ns = {n1,n2};
        for (Notifiable n : ns) {
            n.sendNotification();

        }
    }
}
