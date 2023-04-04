package behaviorals.cor;

public class ATM {

    private BillDispenserChain chain100;

    public ATM() {
        this.chain100 = new Chain100BillReleaser();

        BillDispenserChain chain50 = new Chain50BillReleaser();
        BillDispenserChain chain10 = new Chain10BillReleaser();

        chain50.setNextChain(chain10);
        chain100.setNextChain(chain50);
    }

    public void releaseMoney(int amount) {
        chain100.release(amount);
    }
}

