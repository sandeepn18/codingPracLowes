package factory;

interface Notification{
    void send();
}

class SMSNotification implements Notification{

    @Override
    public void send() {
        System.out.println("sending SMS notification");
    }
}

class EmailNotification implements Notification{

    @Override
    public void send() {
        System.out.println("sending email notification");
    }
}

class NotificationFactory{
    public static Notification createNotification(String s){
        if(s == null || s.isEmpty()){
            return null;
        }

        else if ( s.equals("SMS")){
            return new SMSNotification();
        }
        else{
            return new EmailNotification();
        }

    }
}


public class FactoryPattern{
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("SMS");
        notification.send();
    }
}


