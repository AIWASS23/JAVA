/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

// Classe "Façade" responsável por tratar das interações entre as classes restantes e facilitar na modelagem e implementação da estrutura do código (ou seja,sua interface).
public class SistemasFacade {

  // Natural para nossa classe "Façade" em ter tais atributos, já que vai trabalhar com todos para simplificar a modelagem de suas interações entre si ;)
	protected SistemaDeAudio audio;
	protected SistemaDeInput input;
	protected SistemaDeVideo video;

	public void inicializarSubsistemas() {

		video = new SistemaDeVideo();
		video.configurarCores();
		video.configurarResolucao();

		input = new SistemaDeInput();
		input.configurarJoystick();
		input.configurarTeclado();

		audio = new SistemaDeAudio();
		audio.configurarCanais();
		audio.configurarFrequencia();
		audio.configurarVolume();

	}

	public void reproduzirAudio(String arquivo) {

		audio.reproduzirAudio(arquivo);

	}

	public void renderizarImagem(String imagem) {

		video.renderizarImagem(imagem);

	}

	public void lerInput() {

		input.lerInput(); // Todos os sistemas que trabalhamos precisam de um input kkk

	}

}