package behaviorals.cor;

public class Chain50BillReleaser implements BillDispenserChain {

    private BillDispenserChain nextChain;

    @Override
    public void setNextChain(BillDispenserChain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public void release(int amount) {
        if (amount >= 50) {
            int numberOfBills = amount / 50;
            System.out.println("Release " + numberOfBills + " x 50 bill");
            int rest = amount % 50;
            if(rest > 0){
                nextChain.release(rest);
            }
        } else {
            nextChain.release(amount);
        }
    }
}
