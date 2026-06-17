package payment_system;

public class UpiPayment implements PaymentMethod {

    @Override
    public void pay(double amt) {
        System.out.println("Paid using UPI: " + amt);
    }
}
