package QAPS.QAP1Java.Exercise2;

public class TestDate {
    public static void main(String[] args) {
        // Create a Date object
        Date date = new Date(2024, 9, 13);

        System.out.println("");
        // Print the date using toString() method
        System.out.println("Date: " + date.toString());

        // Test setters
        date.setYear(2025);
        date.setMonth(9);
        date.setDay(31);

        System.out.println("");
        System.out.println("Updated Date: " + date.toString());
    }
}