public class MyClass {
    private static MyClass instance;

    private MyClass(){

    }

     public MyClass getInstance() {
        if(instance == null){
            instance = new MyClass();
        }
        return instance;
    }
}

