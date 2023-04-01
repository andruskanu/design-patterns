package creationals.singleton;

public class SingletonMain {

    public static void main(String[] args) {


        LazySingleton obj1 = LazySingleton.getInstance();
        LazySingleton obj2 = LazySingleton.getInstance();
        LazySingleton obj3 = LazySingleton.getInstance();


        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

    }
}
