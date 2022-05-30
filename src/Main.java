import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        IConta cc = new ContaCorrente();
        cc.depositar(5000);



        Conta poupança = new ContaPoupança();
        cc.transferir(550,poupança);

        cc.imprimirExtrato();
        poupança.imprimirExtrato();
    }
}
