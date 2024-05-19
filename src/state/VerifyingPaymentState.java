package state;

public class VerifyingPaymentState implements VendingMachineState {
    private final VendingMachine vendingMachine;

    public VerifyingPaymentState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertMoney(double amount) {
        vendingMachine.addToBalance(amount);
        System.out.println("Dinero añadido: $" + amount);
    }

    @Override
    public void selectProduct(String product) {
        System.out.println("Verificando pago...");
        if (vendingMachine.getBalance() >= vendingMachine.getProductPrice(product)) {
            System.out.println("Pago verificado. Dispensando " + product + ".");
            vendingMachine.changeState(new DispensingProductState(vendingMachine));
        } else {
            System.out.println("Fondos insuficientes para comprar " + product + ".");
            vendingMachine.changeState(new WaitingForMoneyState(vendingMachine));
        }
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Por favor, selecciona un producto primero.");
    }

    @Override
    public void cancelTransaction() {
        System.out.println("Transacción cancelada.");
        vendingMachine.changeState(new WaitingForMoneyState(vendingMachine));
    }
}
