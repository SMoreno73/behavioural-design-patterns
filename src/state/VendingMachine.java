package state;

public class VendingMachine {
    private double balance;
    private String selectedProduct;
    private VendingMachineState currentState;

    public VendingMachine() {
        this.balance = 0.0;
        this.currentState = new WaitingForMoneyState(this);
    }

    public void changeState(VendingMachineState newState) {
        this.currentState = newState;
    }

    public void addToBalance(double amount) {
        this.balance += amount;
    }

    public void subtractFromBalance(double amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void selectProduct(String product) {
        this.selectedProduct = product;
        currentState.selectProduct(product);
    }

    public void dispenseProduct() {
        currentState.dispenseProduct();
    }

    public void cancelTransaction() {
        currentState.cancelTransaction();
    }

    public String getSelectedProduct() {
        return selectedProduct;
    }

    public double getProductPrice(String product) {
        return 1.0; // Precio ficticio
    }

    public void insertMoney(double amount) {
        balance += amount;
        System.out.println("Se ha insertado $" + amount + " en la máquina expendedora.");
    }

    public void releaseProduct() {
        System.out.println("Producto entregado: " + selectedProduct);
    }
}
