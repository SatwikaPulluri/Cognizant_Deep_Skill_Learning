// File: Main.java

public class Main {
    public static void main(String[] args) {
        // Email only
        Notifier emailOnly = new EmailNotifier();
        emailOnly.send("Server is down!");

        System.out.println();

        // Email + SMS
        Notifier emailSms = new SMSNotifierDecorator(new EmailNotifier());
        emailSms.send("High memory usage!");

        System.out.println();

        // Email + SMS + Slack
        Notifier allChannels = new SlackNotifierDecorator(
                                    new SMSNotifierDecorator(
                                        new EmailNotifier()));
        allChannels.send("Disk space is full!");
    }
}
