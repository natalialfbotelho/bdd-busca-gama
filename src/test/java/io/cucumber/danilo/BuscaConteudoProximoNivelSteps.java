package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import io.cucumber.danilo.services.Configuracao;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class BuscaConteudoProximoNivelSteps {
				
	@Dado("clico na opcao QUERO IR PARA O PROXIMO NIVEL")
	public void verOpcaoProximoNivel() throws InterruptedException {
		Thread.sleep(2000);
		Configuracao.cssSelector("a[id='lp-pom-button-849']").click();
	}

	@Entao("devo ver o valor do curso")
	public void vendooBotaoQueroMeMatricular() {
		 Configuracao.cssSelectors(".product-price--single");
		 Configuracao.fecharPagina();
	}
	
	@Dado("clico na opcao {string}")
	public void clicandoNaOpcao(String string) {	   
	   assertEquals(string, Configuracao.cssSelector("a[class='bt-chamada btc-alt w-button']").getText());
	   Configuracao.cssSelector("a[class='bt-chamada btc-alt w-button']").click();   
	}
	
	@Entao("ver as opcoes")
	public void vendoAsOpcoes(io.cucumber.datatable.DataTable dataTable) {
		Configuracao.cssSelectors(".w-dyn-list");
		Configuracao.fecharPagina();
	}
		
}
