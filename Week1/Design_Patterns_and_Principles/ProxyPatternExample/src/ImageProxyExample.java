// File: ImageProxyExample.java

// Step 2: Subject Interface
interface Image {
    void display();
}

// Step 3: Real Subject
class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromServer();  // simulate expensive operation
    }

    private void loadFromServer() {
        System.out.println("Loading image from server: " + fileName);
    }

    public void display() {
        System.out.println("Displaying: " + fileName);
    }
}

// Step 4: Proxy Class
class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName); // Lazy loading
        } else {
            System.out.println("Using cached image: " + fileName);
        }
        realImage.display();
    }
}
