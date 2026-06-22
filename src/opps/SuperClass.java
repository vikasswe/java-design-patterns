package opps;

public class SuperClass {

    String name = "vikas";

    SuperClass(){
        System.out.println("Invoked super class");
    }

    void printNameMain() {
        System.out.println(this.name);
    }

}


class Another extends SuperClass {

    Another(){
        super();
    }

    void printName(){
        System.out.println(super.name);
    }

}

class MainClass {
    public static void main(String[] args) {
        Another another = new Another();
        another.printName();
        another.printNameMain();
    }
}