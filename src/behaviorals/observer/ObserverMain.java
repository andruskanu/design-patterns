package behaviorals.observer;

public class ObserverMain {

    public static void main(String[] args) {

        Author author = new Author();
        Student student = new Student();
        Employee employee = new Employee();

        author.subscribe(student);
        author.subscribe(employee);
        author.writeArticle("Superman");

        System.out.println("--------------------------------------");

        author.unsubscribe(employee);
        author.writeArticle("Batman");

    }
}
