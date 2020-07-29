public class ContaInvestimento extends ContaCooperada implements Imprimivel {

    public ContaInvestimento(String numero) {
        this.numero = numero;
        this.saldo = 0.00;
    }
    
    @Override
    public void depositar(double quantia) {
        this.saldo = this.saldo + quantia;
    }

    @Override
    public void sacar(double quantia) {
        if (this.saldo >= quantia) {
            this.saldo = this.saldo - quantia;
        } else {
            System.out.println("Você não tem saldo suficiente para esta operação.");
        }
    }

    @Override
    public void mostrarDados() {
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + "M$" + this.saldo);
    }
    
}