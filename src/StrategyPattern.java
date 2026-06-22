public class StrategyPattern {
    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new UPIPayment();
        paymentStrategy.pay(25);
    }

}


interface PaymentStrategy{
    void pay(int amt);
}


class UPIPayment implements PaymentStrategy {
    @Override
    public void pay(int amt){
        System.out.println("It decide the strategy of payment "  + amt);
    }

}