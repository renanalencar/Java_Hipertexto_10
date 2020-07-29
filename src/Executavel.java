/**
 * @author Renan Costa Alencar
 * @version 1.0
 */
public class Executavel {
    public static void main(String[] args) {
        // instancia uma conta tipo ContaCorrente
        System.out.println("Criando conta corrente de número 7854 e limite M$500.00...");
        ContaCorrente contaCorrente = new ContaCorrente("7854", 500.00);
        // credita algum valor
        System.out.println("Depositando M$500.00...");
        contaCorrente.depositar(500.00);
        // efetua saque
        System.out.println("Sacando M$1000.00...");
        contaCorrente.sacar(1000.00);
        // mostra dados da conta
        System.out.println("Mostrando dados da conta...");
        contaCorrente.mostrarDados();

        // istancia uma conta do tipo ContaInvestimento
        System.out.println("\nCriando conta investimento de número 1223...");
        ContaInvestimento contaInvestimento = new ContaInvestimento("1223");
        // credita algum valor
        System.out.println("Depositando M$1000.00...");
        contaInvestimento.depositar(1000.00);
        // efetua saque maior que o saldo
        System.out.println("Sacando M$1100.00...");
        contaInvestimento.sacar(1100.00);
        System.out.println("Mostrando dados da conta...");
        // mostra dados da conta
        contaInvestimento.mostrarDados();
    }
    
}