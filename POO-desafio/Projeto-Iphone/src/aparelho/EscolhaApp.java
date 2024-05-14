package aparelho;

import apps.AparelhoTelefonico;
import apps.NavegadorInternet;
import apps.ReprodutorMusical;

public class EscolhaApp {
	public static void main(String[] args) {
		ReprodutorMusical reprodutor = new Iphone();
		AparelhoTelefonico aparelho = new Iphone();
		NavegadorInternet navegador = new Iphone();
		
		reprodutor.tocar();
		reprodutor.pausar();
		reprodutor.selecionarMusica();
		
		aparelho.ligar();
		aparelho.atender();
		aparelho.iniciarCorreioVoz();
		
		navegador.exibirPagina();
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		
	}
}
