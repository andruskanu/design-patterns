package behaviorals.cor;

public interface BillDispenserChain {

    void setNextChain(BillDispenserChain nextChain);

    void release(int amount);

}
