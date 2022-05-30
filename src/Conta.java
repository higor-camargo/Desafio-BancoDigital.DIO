public class Conta implements IConta{

    private  static final int AGENCIA_PADRAO = 1;

    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected int saldo;



    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }



    public void sacar() {


    }

    public void depositar() {

    }


    @Override
    public void sacar(double valor) {
        saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;

    }

    @Override
    public void transferir(double valor, Conta contaDesino) {
        this.sacar(valor);
        contaDesino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {

    }


    public void transferir() {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public int getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns(){
        System.out.println((String.format("agencia;%d",this.agencia)));
        System.out.println((String.format("numero;%d",this.numero)));
        System.out.println((String.format("saldo;%d",this.saldo)));

    }


}


