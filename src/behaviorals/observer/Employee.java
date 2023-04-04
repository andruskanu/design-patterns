package behaviorals.observer;

public class Employee extends Observer{

    @Override
    public void articlePublished(String article) {
        System.out.println("The employee reads the article: " + article);
    }
}
