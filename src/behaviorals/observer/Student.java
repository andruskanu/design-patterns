package behaviorals.observer;

public class Student extends Observer{

    @Override
    public void articlePublished(String article) {
        System.out.println("The student reads the article: " + article);
    }
}
