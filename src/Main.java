
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);
		Banco banco = new Banco();
		banco.adicionarNovaConta(cc);
		banco.adicionarNovaConta(poupanca);
		banco.imprimirContas();

		System.out.println("\n\nTeste de duplicata de conta\n");
		banco.adicionarNovaConta(poupanca);
		banco.imprimirContas();

		System.out.println("\n\nTeste funcionalidade deposito\n");
		banco.getContas().get(1).depositar(2000);
		banco.imprimirContas();

		System.out.println("\n\nTeste funcionalidade saque\n");
		banco.getContas().get(2).sacar(100);
		banco.getContas().get(1).sacar(200);
		banco.imprimirContas();

		System.out.println("\n\nTeste funcionalidade transferencia\n");
		banco.getContas().get(1).transferir(300, poupanca);
		banco.imprimirContas();
	}

}
