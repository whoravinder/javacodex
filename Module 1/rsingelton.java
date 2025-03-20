class Singleton {
    private static Singleton instance;

    private Singleton() {} 

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("I am Ravinder");
    }
}

public class rsingelton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}

