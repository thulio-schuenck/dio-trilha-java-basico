public class Main {

	public static void main(String[] args) {
		Cliente thulio = new Cliente();
		thulio.setNome("Thulio");
		
		
		Conta cc = new ContaCorrente(thulio);
		Conta poupanca = new ContaPoupanca(thulio);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
