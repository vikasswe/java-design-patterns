package opps;

public class Encapsulation {
    public static void main(String[] args) {
        TestingEncap testingEncap = new TestingEncap();
        testingEncap.setId(10);
        System.out.println(testingEncap.getId());

    }
}


class TestingEncap {
    private int id;

    void setId(int id){
        this.id = id;
    }

    int getId(){
        return id;
    }

}