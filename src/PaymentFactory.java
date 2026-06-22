public class PaymentFactory {

    public static Payment getPayment(String type) {
        if(type.equals("UPI")) return new UpiPayment();
        return null;
    }

    public static void main(String[] args) {
        Payment p = PaymentFactory.getPayment("UPI");
        p.pay();
    }

}




interface Payment {
    void pay();
}

class UpiPayment implements Payment {
    @Override
    public void pay(){
        System.out.println("UPI payment");
    }

}

// Create objects without exposing creation logic.
// Object creation is centralized