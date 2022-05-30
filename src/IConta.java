public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    abstract void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();


}
