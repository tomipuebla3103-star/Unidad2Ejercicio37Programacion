//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    RedBitcoin Bitcoin = new RedBitcoin();
    RedEthereum Ethereum = new RedEthereum();
    RedSolana Solana = new RedSolana();

    if (Bitcoin.ejecutarTransaccion("BTC123456", "BTC789012", 1000)) {
        System.out.println("Transaccion confirmada en Bitcoin");
    } else {
        System.out.println("Transaccion rechazada en Bitcoin");
    }

    if (Ethereum.ejecutarTransaccion("0x1234", "0x5678", 50)) {
        System.out.println("Transaccion confirmada en Ethereum");
    } else {
        System.out.println("Transaccion rechazada en Ethereum");
    }

    if (Solana.ejecutarTransaccion(
            "DireccionSolana12345678901234567890",
            "OtraDireccionSolana123456789012345678",
            20)) {
        System.out.println("Transaccion confirmada en Solana");
    } else {
        System.out.println("Transaccion rechazada en Solana");
    }
}
