package state;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.selectProduct("Snack"); // Output: Por favor, inserta dinero primero.

        vendingMachine.insertMoney(2.0); // Output: Dinero insertado: $2.0

        vendingMachine.selectProduct("Bebida"); // Output: Verificando pago...
        // Simulación de la compra exitosa
        vendingMachine.dispenseProduct(); // Output: Entregando producto... Producto entregado: Bebida

        vendingMachine.selectProduct("Bebida"); // Output: Por favor, inserta dinero primero.

        vendingMachine.cancelTransaction(); // Output: No hay transacción para cancelar.

        vendingMachine.insertMoney(1.0); // Output: Dinero insertado: $1.0

        vendingMachine.selectProduct("Snack"); // Output: Verificando pago...

        // Simulación de la compra fallida debido a fondos insuficientes
        vendingMachine.dispenseProduct(); // Output: Fondos insuficientes para comprar Snack.

        vendingMachine.cancelTransaction(); // Output: Transacción cancelada.
    }
}