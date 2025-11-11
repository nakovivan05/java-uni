package Sem3;
abstract class PaymentMethod {
    abstract void processPayment(double amount);
}
class CreditCard extends PaymentMethod {
    private String cardNumber;
    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    private String getMaskedCardNumber() {
        int length = cardNumber.length();
        String last4 = cardNumber.substring(length - 4);
        return "**** **** **** " + last4;
    }
    @Override
    void processPayment(double amount) {
        System.out.printf("Card: %s, Payment: %f%n",getMaskedCardNumber(),amount);
    }
}
class PayPal extends PaymentMethod {
    private String email;
    public PayPal(String email) {
        this.email = email;
    }
    @Override
    void processPayment(double amount) {
        System.out.printf("Payment %f from %s",amount,email);
    }
}
public class Main3 {
    public static void main(String[] args) {
        PaymentMethod method1 = new CreditCard("1234567812345678");
        PaymentMethod method2 = new PayPal("user@example.com");
        method1.processPayment(150.75);
        method2.processPayment(89.99);
    }
}
