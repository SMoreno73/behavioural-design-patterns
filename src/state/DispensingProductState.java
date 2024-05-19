package state;

public class DispensingProductState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public DispensingProductState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(double amount) {
        System.out.println("Ya se ha iniciado una compra. Por favor, espere la entrega del producto.");
    }

    @Override
    public void selectProduct(String product) {
        System.out.println("Ya se ha iniciado una compra. Por favor, espere la entrega del producto.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Entregando producto...");
        vendingMachine.subtractFromBalance(vendingMachine.getProductPrice(vendingMachine.getSelectedProduct()));
        vendingMachine.releaseProduct();
        vendingMachine.changeState(new WaitingForMoneyState(vendingMachine));
    }

    @Override
    public void cancelTransaction() {
        System.out.println("Transacción cancelada. Devolviendo dinero.");
        vendingMachine.changeState(new WaitingForMoneyState(vendingMachine));
    }
}
