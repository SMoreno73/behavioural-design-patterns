package state;

public class WaitingForMoneyState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public WaitingForMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(double amount) {
        vendingMachine.addToBalance(amount);
        System.out.println("Dinero insertado: $" + amount);
        vendingMachine.changeState(new VerifyingPaymentState(vendingMachine));
    }

    @Override
    public void selectProduct(String product) {
        System.out.println("Por favor, inserta dinero primero.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Por favor, inserta dinero primero.");
    }

    @Override
    public void cancelTransaction() {
        System.out.println("No hay transacción para cancelar.");
    }
}
