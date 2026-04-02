class Notifier {
    public void send(String message) {
        System.out.println("General Alert: " + message);
        logNotification(message); // calling private method internally
    }
    protected void send(String message, String email) {
        System.out.println("Email sent to " + email + ": " + message);
    }
    void send(String message, long phoneNumber) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }

    private void logNotification(String message) {
        System.out.println("Notification logged internally: " + message);
    }
}

class AppNotifier extends Notifier {

    public void testMethods() {
        // Accessing inherited methods
        send("Welcome!"); // public
        send("Your bill is ready", "user@gmail.com"); // protected
        send("OTP is 1234", 9876543210L); // default

    }
}

public class NotificationDemo {
    public static void main(String[] args) {
        AppNotifier app = new AppNotifier();
        app.send("Hello User");
        app.send("Meeting Reminder", "abc@gmail.com");
        app.send("OTP Code", 9999999999L);
        app.testMethods();
    }
}