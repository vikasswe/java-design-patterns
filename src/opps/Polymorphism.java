package opps;

public class Polymorphism {

    public static void main(String[] args) {
        CompileTime compileTime = new CompileTime();
        compileTime.sum(4,5);

        Animal a = new Dog();
        a.breath();
    }
}


class CompileTime {
    void sum(int a , int b){
        System.out.println(a+b);
    }

    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
}


class Animal {
    void breath(){
        System.out.println("Animal Breathing");
    }
}

class Dog extends Animal {

    @Override
    void breath(){
        System.out.println("Dog Breathing");
    }
}