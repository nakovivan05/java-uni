package Sem3;

class EmailMessage implements Message {
    @Override
    public void send() {
        System.out.println("Sending an email!");
    }
}

class SMSMessage implements Message {
    @Override
    public void send() {
        System.out.println("Sending a SMS!");
    }
}

class PushNotification implements Message {
    @Override
    public void send() {
        System.out.println("Sending a push notification!");
    }
}

class MessageFactory {
    public Message createMessage(String type) {
        switch (type) {
            case "Email":
                return new EmailMessage();
            case "SMS":
                return new SMSMessage();
            case "Push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown message type");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MessageFactory messageFactory = new MessageFactory();
        Message email = messageFactory.createMessage("Email");
        email.send();
        Message sms = messageFactory.createMessage("SMS");
        sms.send();
        Message push = messageFactory.createMessage("Push");
        push.send();
        Message error = messageFactory.createMessage("Error");
    }
}
