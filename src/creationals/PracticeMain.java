package creationals;

public class PracticeMain {

    public static void main(String[] args) {

        Servers obj1 = Servers.getInstance();
        Servers obj2 = Servers.getInstance();

        System.out.println(obj1.addServer("http://google.com"));
        System.out.println(obj1.addServer("http://yahoo.com"));
        System.out.println(obj1.addServer("https://facebook.com"));
        System.out.println(obj2.addServer("https://linkedin.com"));
        System.out.println(obj2.addServer("http://w3schools.com"));
        System.out.println(obj2.addServer("https://jetbrains.com"));


        obj1.getHttpServers().stream().forEach(System.out::println);
        System.out.println();
        obj2.getHttpsServers().stream().forEach(System.out::println);
    }
}
