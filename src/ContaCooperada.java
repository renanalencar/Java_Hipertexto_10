public abstract class ContaCooperada {
    protected String numero;
    protected double saldo;

    public abstract void sacar(double quantia);
    public abstract void depositar(double quantia);
}