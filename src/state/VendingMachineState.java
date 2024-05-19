package state;

public interface VendingMachineState {
    void insertMoney(double amount);
    void selectProduct(String product);
    void dispenseProduct();
    void cancelTransaction();
}
