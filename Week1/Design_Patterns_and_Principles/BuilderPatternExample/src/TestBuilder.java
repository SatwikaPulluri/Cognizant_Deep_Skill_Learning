// File: src/TestBuilder.java

public class TestBuilder {
    public static void main(String[] args) {
        // Creating computer with all parts
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB")
                                .setStorage("1TB SSD")
                                .setGraphicsCard("NVIDIA RTX 4090")
                                .build();

        // Creating computer with only required parts
        Computer officePC = new Computer.Builder("Intel i5", "8GB").build();

        System.out.println("Gaming PC: " + gamingPC);
        System.out.println("Office PC: " + officePC);
    }
}
