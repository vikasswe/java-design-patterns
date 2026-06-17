package payment_system;

public class CreditCardPayment implements PaymentMethod, Refundable {

    @Override
    public void pay(double amt) {
        System.out.println("Paid using Credit Card: " + amt);
    }

    public void refund(double amt){
        System.out.println("Refund using Credit Card: " + amt);
    }
}


