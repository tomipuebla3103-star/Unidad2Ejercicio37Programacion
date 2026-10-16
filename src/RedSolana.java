public class RedSolana {
    double verificarSaldo(String direccionWallet) {
        if (direccionWallet == null || direccionWallet.length() < 32) {
            return 0;
        }

        return 200;
    }

    boolean ejecutarTransaccion(String origen, String destino, double monto) {
        if (origen == null || destino == null ||
                origen.length() < 32 || destino.length() < 32 ||
                monto <= 0 || verificarSaldo(origen) < monto) {
            return false;
        }

        System.out.println("Transaccion enviada a la red Solana");
        System.out.println("Esperando confirmacion de Solana...");
        return true;
    }
}
