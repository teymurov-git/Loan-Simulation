public class Main{
    public static void main(String[] args) {
        System.out.println("Creating ConsumerLoan...");
        ConsumerLoan consumer = new ConsumerLoan(10000, 5, 3);

        System.out.println("\nCreating BusinessLoan...");
        Business business = new Business(20000, 6, 4);

        System.out.println("\nConsumer Total Payment: " + consumer.calculateTotalPayment());
        System.out.println("Business Total Payment: " + business.calculateTotalPayment());
    }
}