/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
  * *Comentários: Código implementando o PP do tipo "Singleton"
  *********************************************************************************************
  * *Obs. Mesmo só utilizando de duas simples classe fiz questão de explicar ess padrão porque é difícel encontrar implementações dele por aí afinal o principal uso do padrão se dá quando é preciso garantir que apenas um objeto de uma determinada classe seja criado no código em desenvolvimento. Aqui
  *********************************************************************************************
  * * (Definindo o PP - "Singleton") - Segundo a definição da Wikipédia: 
  * Em engenharia de software, o padrão singleton é um padrão de projeto que restringe a instanciação de uma classe para um único objeto. Isto é útil quando exatamente um objeto é necessário para coordenar ações por todo o sistema..
  *********************************************************************************************
	*/

// Código "Teste":
class Main
{
    public static void main(String args[])
    {
        // Instanciando classe "Singleton" com a variável x
        Singleton x = Singleton.Singleton();
  
        // Instanciando classe "Singleton" com a variável y
        Singleton y = Singleton.Singleton();
  
        // Instanciando classe "Singleton" com a variável z
        Singleton z = Singleton.Singleton();
  
        System.out.println(" ");
        System.out.println("---------------------------------------------------------------");
        System.out.println("IFCE - Prof.Ronaldo Ramos 🎷 - PP - Singleton (Exemplo - simples) ");
        System.out.println("---------------------------------------------------------------");
        System.out.println(" ");

        // Alterando a variável da classe "Singleton.java" instanciada como x 
        x.frase_teste = (x.frase_teste).toUpperCase();// Aqui usamos o método "toUpperCase()" para pegar a string da classe definida como nosso "Singleton" e mudamos suas letras TODAS PARA MAIÚSCULAS

        System.out.println("+*****************************************************************************+");
        System.out.println(" Print dos atributos dos objetos x,y e z da classe Singleton.java");
        System.out.println(" *Hipótese - Com a alteração, apenas a frase do objeto x deve ficar Maiúscula.");
        System.out.println("+-----------------------------------------------------------------------------+");
        System.out.println(" *Teste - Obs. alterção feita no atributo do objeto x da classe Singleton.java:");
        System.out.println("+*****************************************************************************+");
  
        System.out.println("\nAtributo de: x(alterado) -> " + x.frase_teste);
        System.out.println("Atributo de: y -> " + y.frase_teste);
        System.out.println("Atributo de: z -> " + z.frase_teste);

        System.out.println("y e z também, tiveram suas frase mudadas!\n");

        System.out.println("       .-\"\"\"\"\"\"-.  ");
        System.out.println("     .'   \\  //  '.      ");
        System.out.println("    /   O      O   \\    ");
        System.out.println("   :                :    ");
        System.out.println("   |                |    "); 
        System.out.println("   :       __       :    ");
        System.out.println("    \\  .-\"`  `\"-.  /   ");
        System.out.println("     '.          .'      ");
        System.out.println("       '-......-'        ~ Ei meu chapa eu sou o objeto y do tipo \"Singleton.Singleton()\";  ");
        System.out.println("       '-......-'          Vim reclamar que meu atributo foi alterado sem minha permissão,");
        System.out.println("                           gostei disso não, era pra ser só o do meu amigo \"x\" "); 

        System.out.println("       .-\"\"\"\"\"\"-.  ");
        System.out.println("     .'   \\  //  '.      ");
        System.out.println("    /   O      O   \\    ");
        System.out.println("   :                :    ");
        System.out.println("   |                |    "); 
        System.out.println("   :       __       :    ");
        System.out.println("    \\  .-\"`  `\"-.  /   ");
        System.out.println("     '.          .'      ");
        System.out.println("       '-......-'        ~ Ei meu chapa eu sou o objeto z do tipo \"Singleton.Singleton()\";  ");
        System.out.println("       '-......-'          Também vim reclamar que meu atributo foi alterado sem minha permissão,");
        System.out.println("                           gostei disso não, era pra ser só o do meu amigo \"x\" \n"); 

        // Percebe que mesmo mudando o valor apenas da string de x ao "printarmos" os valore de y e z os valores de suas string também se alteraram que nem em x? Isso porque esse padrão "introduz um estado global" à sua aplicação e mudanças em um lugar podem ocasionar efeitos em outras areas, como ocorre nos outputs acima! Ou seja, nossa simples implementação do PP - Singleton já demonstra tal comportamento considerado por muito "perigoso" e é o motivo de realmente não fazer desse PP muito usado, por isso disse que achei difícil achar exemplos dele, então acabei por criar uma simples versão que demonstra-se PORQUE esse PP é tão "evitado" e são poucas sua implementações!

  
        // Alterando a variável da classe "Singleton.java" instanciada como z
        z.frase_teste = (z.frase_teste).toLowerCase();// Aqui usamos o método "toUpperCase()" para pegar a string da classe definida como nosso "Singleton" e mudamos suas letras TODAS PARA MINÚSCULAS novamente
  
        System.out.println("+*****************************************************************************+");
        System.out.println(" Obs.2 Segunda Alterção feita no atributo do objeto z da classe Singleton.java,");
        System.out.println(" *Hipótese - Com a alteração, apenas a frase do objeto z deve ficar minúscula.");
        System.out.println("+-----------------------------------------------------------------------------+");
        System.out.println(" *Teste - Print dos atributos dos objetos x,y e z da classe Singleton.java:");
        System.out.println("+*****************************************************************************+");

        System.out.println("\nAtributo de: x -> " + x.frase_teste);
        System.out.println("Atributo de: y -> " + y.frase_teste);
        System.out.println("Atributo de: z(alterado) -> " + z.frase_teste);
        // Mais uma vez, o comportmento se repete, agora, mudamos z mas x e y se alteram também!

        System.out.println("x e y também, tiveram suas frase mudadas!\n");

        System.out.println("       .-\"\"\"\"\"\"-.  ");
        System.out.println("     .'   \\  //  '.      ");
        System.out.println("    /   O      O   \\    ");
        System.out.println("   :                :    ");
        System.out.println("   |                |    "); 
        System.out.println("   :       __       :    ");
        System.out.println("    \\  .-\"`  `\"-.  /   ");
        System.out.println("     '.          .'      ");
        System.out.println("       '-......-'        ~ Ei meu chapa agora aqui é o objeto x do tipo \"Singleton.Singleton()\";  ");
        System.out.println("       '-......-'          Vim reclamar que meu atributo foi alterado sem minha permissão,só do objeto \"z\" que mudou");
        System.out.println("                           agora entendo a dor dos meus amigos anteriormente"); 

        System.out.println("       .-\"\"\"\"\"\"-.  ");
        System.out.println("     .'   \\  //  '.      ");
        System.out.println("    /   O      O   \\    ");
        System.out.println("   :                :    ");
        System.out.println("   |                |    "); 
        System.out.println("   :       __       :    ");
        System.out.println("    \\  .-\"`  `\"-.  /   ");
        System.out.println("     '.          .'      ");
        System.out.println("       '-......-'        ~ Ei meu chapa agora aqui é o objeto y do tipo \"Singleton.Singleton()\";  ");
        System.out.println("       '-......-'          De novo você alterou meu atributo sem minha permissão,só do objeto \"z\" que mudou");
        System.out.println("                           faça mais isso não\n");

        System.out.println("+**********************************************************************+");
        System.out.println("+ Lição: Cuidado ao usar Singleton, seus objetos podem ficar com raiva +");
        System.out.println("+ de vc kkkk+");
        System.out.println("+**********************************************************************+");

    }
}