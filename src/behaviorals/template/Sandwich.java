package behaviorals.template;

public abstract class Sandwich {

    public void makeSandwich(){
        cutBread();
        if(customerWantsMeat()){
            addMeat();
        }
        if(customerWantsCheese()){
            addCheese();
        }
        addVegetables();
        wrap();
    }

    private void cutBread(){
        System.out.println("The bread is cut");
    }

    abstract void addMeat();

    abstract void addCheese();

    abstract void addVegetables();

    protected boolean customerWantsMeat(){
        return true;
    }

    protected boolean customerWantsCheese(){
        return true;
    }

    private void wrap(){
        System.out.println("The sandwich is ready");
    }

}
