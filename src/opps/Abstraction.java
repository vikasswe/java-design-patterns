package opps;

public class Abstraction {
    public static void main(String[] args) {
       Vehicle v = new Car();
        v.start();
        v.stop();
    }
}


abstract class Vehicle {
    abstract void start();
    void stop(){
        System.out.println("Stopped . . . . ");
    }
}

class Car extends Vehicle {
    void start(){
        System.out.println("Started . . . . .");
    }
}