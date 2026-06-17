package payment_system;

public class MainClass {

    public static void main(String[] args) {
        PaymentMethod paymentMethod = new PaypalPayment();
        Refundable refundable = new CreditCardPayment();
        PaymentService paymentService = new PaymentService(paymentMethod, refundable);

        paymentService.makePayment(45);
        paymentService.refundPayment(40);
    }

}
