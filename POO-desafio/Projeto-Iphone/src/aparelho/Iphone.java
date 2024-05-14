package aparelho;

import apps.AparelhoTelefonico;
import apps.NavegadorInternet;
import apps.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
	public void exibirPagina() {
		System.out.println("EXIBINDO PÁGINA DA INTERNET NO IPHONE");
	}
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO UMA NOVA ABA NA PÁGINA DA INTERNET NO IPHONE");
	}
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PÁGINA DA INTERNET NO IPHONE");
	}

	public void ligar() {
		System.out.println("LIGANDO PELO IPHONE");
	}
	public void atender() {
		System.out.println("ATENDENDO UMA LIGAÇÃO PELO");	
	}
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO UM CORREIO DE VOZ PELO IPHONE");
	}


	public void tocar() {
		System.out.println("TOCANDO MÚSICA NO IPHONE");
	}
	public void pausar() {
		System.out.println("PAUSANDO MÚSICA NO IPHONE");
	}
	public void selecionarMusica() {
		System.out.println("SELECIONANDO MÚSICA NO IPHONE");
	}

	
}