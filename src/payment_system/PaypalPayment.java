package payment_system;

public class PaypalPayment implements PaymentMethod {

    @Override
    public void pay(double amt) {
        System.out.println("Paid using PayPal: " + amt);
    }

}
