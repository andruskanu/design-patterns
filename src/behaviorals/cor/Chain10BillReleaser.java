package behaviorals.cor;

public class Chain10BillReleaser implements BillDispenserChain {


    @Override
    public void setNextChain(BillDispenserChain nextChain) {

    }

    @Override
    public void release(int amount) {
        if (amount >= 10) {
            int numberOfBills = amount / 10;
            System.out.println("Release " + numberOfBills + " x 10 bill");
            int rest = amount % 10;
            if (rest > 0) {
                System.out.println("We can't release bills less than 10");
            }
        }
    }
}
