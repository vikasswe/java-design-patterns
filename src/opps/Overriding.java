package opps;

public class Overriding {
    public static void main(String[] args) {
        Child p = new Child();
        p.printData();
    }
}


class Parent {
    void printData (){
        System.out.println("I am parent");
    }
}

class Child extends Parent{
    @Override
    void printData(){
        System.out.println("I am child");
    }
}