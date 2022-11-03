/*
  * *Comentários: "State"
  *********************************************************************************************
  * *Obs. Esse Projeto de forma 'simples' permite que você 'mude o comportamento' de uma classe quando 
    o determinado estado muda. Na minha opnião é um dos padrões que acho mais divertido pois seu uso
    não só é quase 'infinito' kkkk como há muitas possibilidades divertidas para se usá-lo. Aqui trouxe
    esse exemplo 'óbvio' que pensei logo de cara quando vi o nome do PP, ninguém melhor do que um dos
    personagens mais famosos dos games, nosso amigo Mario!, pra mostrar a essência desse padrão, que
    pelas classes já diz tudo né? kkkkk.
  *********************************************************************************************
  * * ("state") - Segundo a definição da Wikipédia: 
  * O padrão State é um padrão comportamental de design de software que implementa uma máquina de estados de maneira orientada à objetos. Com o padrão State, uma máquina de estados é implementada através da implementação de cada um dos estados individuais como uma classe derivada da interface do padrão State, e implementando transições de estado através de chamadas de métodos definidos na superclasse do padrão. O padrão State pode ser interpretado como um padrão de estratégia que é capaz de alterar a estratégia corrente através de invocações de métodos definidos na interface do padrão.
  *********************************************************************************************
	*/

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

class Main {

	public static void main(String[] args) {

    new MainFrame();//Classe que exibe um gif do personagem 'Super Mario' na tela gráfica do Replit! Sim, até o Mario veio dar um oi, procura ele aí! ;)

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" State ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

    //Teste de entradas para a configurção de PP do tipo 'State':
		Mario mario = new Mario();
		mario.pegarCogumelo();
		mario.pegarPena();
		mario.levarDano();
		mario.pegarFlor();
		mario.pegarFlor();
		mario.levarDano();
		mario.levarDano();
		mario.pegarPena();
		mario.levarDano();
		mario.levarDano();
		mario.levarDano();

    System.out.println(" ");
    System.out.println("---------------------------------------------------------------");
    System.out.println("                     FIM DE JOGO - :(                          ");
    System.out.println("---------------------------------------------------------------");
    System.out.println(" ");

	}

}