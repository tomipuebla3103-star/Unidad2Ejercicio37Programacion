public class RedEthereum {
    double verificarSaldo(String direccionWallet) {
        if (direccionWallet == null || !direccionWallet.startsWith("0x")) {
            return 0;
        }

        return 100;
    }

    boolean ejecutarTransaccion(String origen, String destino, double monto) {
        if (origen == null || destino == null ||
                !origen.startsWith("0x") || !destino.startsWith("0x") ||
                monto <= 0 || verificarSaldo(origen) < monto) {
            return false;
        }

        System.out.println("Transaccion enviada a la red Ethereum");
        System.out.println("Esperando confirmacion de Ethereum...");
        return true;
    }
}
