package io.cucumber.danilo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.danilo.services.Configuracao;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class BuscaConteudoManifestoSteps {
	
	
	@Dado("clico na opcao Quem somos")
	public void clicandoNoBotaoQuemSomos() {
	   Configuracao.cssSelector("a[href='/sobre']").click();
	}

	@Entao("deve ver o item do {string}")
	public void vendoItemManifesto(String string) {
		assertEquals(string, Configuracao.cssSelector(".manifesto h1.heading.lado").getText());
		Configuracao.fecharPagina();
	}

	
}
