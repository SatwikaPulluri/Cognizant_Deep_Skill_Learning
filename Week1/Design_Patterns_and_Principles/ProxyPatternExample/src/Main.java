// File: Main.java

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("nature.jpg");
        Image image2 = new ProxyImage("city.jpg");

        // First time: loads from server
        image1.display();

        // Cached version used
        image1.display();

        // First time: loads another image
        image2.display();
    }
}
