package payment_system;

public class PaymentService {

    private PaymentMethod paymentMethod;
    private Refundable refundable;

    public PaymentService(PaymentMethod paymentMethod, Refundable refundable){
        this.paymentMethod = paymentMethod;
        this.refundable = refundable;
    }

    public void makePayment(double amt){
        paymentMethod.pay(amt);
    }

    public void refundPayment(double amt){
        refundable.refund(amt);
    }

}
