
// Nosso código que implementa o padrão Singeton, de forma "simple e enxuta" o padrão pode ser
// implementado como a classe abaixo, que leva o nome do padrão como seu.
class Singleton
{
    // Variável estática "single_instance" do tipo "Singleton"
    private static Singleton instancia_da_classe=null;
  
    // Variável do tipo string, para fazermos nosso teste rápido de uso dessa classe.
    public String frase_teste;
  
    // construtor privado restrito a essa classe e ninguém mais do que ela mesma.
    private Singleton()
    {
        frase_teste = "Oi! Eu sou uma string que é parte da classe \"Singleto.java\"  ㋡";
    }
  
    // Méotodo do tipo estático para proporcionar a criação de uma instância da classe "Singleton.java".
    public static Singleton Singleton()
    {
        // Condicional para garantir que APENAS UMA INSTÂNCIA seja criada quando chamado o método.
        if (instancia_da_classe == null)
        {
            instancia_da_classe = new Singleton();
        }
        return instancia_da_classe;
    }
}