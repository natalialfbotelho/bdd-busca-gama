# language: pt
Funcionalidade: Busca de conteudos no site da Gama Academy proximo nivel

	Cenario: Buscando quero ir para o proximo nivel
		Dado que eu estou no site da gama academy "https://pages.gama.academy/curso-de-product-management/"
		E clico na opcao QUERO IR PARA O PROXIMO NIVEL
		Entao devo ver o valor do curso
		
	Cenario: Vendo opcoes portfolio, carreira e professores no site da Gama Academy
		Dado que eu estou no site da gama academy "https://www.gama.academy/"
		E clico na opcao "DEV FULLSTACK"
		Entao ver as opcoes
		  |Crie seu portfólio!| 
		  |Acompanhamento de Carreira|
		  |Professores de surf que sabem surfar!|
		  |Estude na Melhor Startup de Educacao|
	  
