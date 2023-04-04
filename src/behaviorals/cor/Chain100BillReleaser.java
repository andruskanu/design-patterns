package behaviorals.cor;

public class Chain100BillReleaser implements BillDispenserChain{

    private BillDispenserChain nextChain;

    @Override
    public void setNextChain(BillDispenserChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void release(int amount) {
        if (amount >= 100) {
            int numberOfBills = amount / 100;
            System.out.println("Release " + numberOfBills + " x 100 bill");
            int rest = amount % 100;
            if(rest > 0){
                nextChain.release(rest);
            }
        } else {
            nextChain.release(amount);
        }
    }
}
