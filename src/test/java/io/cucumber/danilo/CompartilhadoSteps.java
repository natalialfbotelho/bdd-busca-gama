package io.cucumber.danilo;

import io.cucumber.danilo.services.Configuracao;
import io.cucumber.java.pt.Dado;

public class CompartilhadoSteps {
	
	@Dado("que eu estou no site da gama academy {string}")
	public void abrindoPagina(String string) throws InterruptedException {
	    Configuracao.abrirPagina(string);
//	    Thread.sleep(5000);
//	    Configuracao.cssSelector(".ub-emb-close").click();
	}	

	
}
