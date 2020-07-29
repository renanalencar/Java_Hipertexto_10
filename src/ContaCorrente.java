public class ContaCorrente extends ContaCooperada implements Imprimivel {
    private double limite;

    public ContaCorrente(String numero, double limite) {
        this.numero = numero;
        this.saldo = 0.00;
        this.limite = limite;
    }

    @Override
    public void depositar(double quantia) {
        this.saldo = this.saldo + quantia;
    }

    @Override
    public void sacar(double quantia) {
        if (this.saldo >= quantia || Math.abs(saldo) <= limite) {
            this.saldo = this.saldo - quantia;
        } else {
            System.out.println("Você não tem saldo suficiente para esta operação.");
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Limite: " + "M$" + this.limite);
        System.out.println("Saldo: " + "M$" + this.saldo);
    }

    

}