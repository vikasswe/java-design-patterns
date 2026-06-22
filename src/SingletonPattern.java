public class SingletonPattern {

    private static  SingletonPattern singletonPattern;

    private  SingletonPattern(){}

    public static SingletonPattern getInstance() {
        if (singletonPattern == null) {
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }
}


class MainSingle {
    public static void main(String[] args) {
        SingletonPattern logger = SingletonPattern.getInstance();
    }
}
// Basically it is used to crate single source of truth eg: Database, logger, Configuration

