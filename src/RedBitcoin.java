public class RedBitcoin {
    String direccionValida = "BTC123456";

    double verificarSaldo(String direccionWallet) {
        if (direccionWallet == null || !direccionWallet.startsWith("BTC")) {
            return 0;
        }

        return 50000;
    }

    boolean ejecutarTransaccion(String origen, String destino, double monto) {
        if (origen == null || destino == null ||
                !origen.startsWith("BTC") || !destino.startsWith("BTC") ||
                monto <= 0 || verificarSaldo(origen) < monto) {
            return false;
        }

        System.out.println("Transaccion enviada a la red Bitcoin");
        System.out.println("Esperando confirmacion de Bitcoin...");
        return true;
    }
}
