/*
  *********************************************************************************************
  * ( )[ ][ ]                                                                                 *
  * [ ][ ]                                                                                    *
  * [ ][ ][ ]                                                                                 *
  * [ ][ ]    - IFCE - Padrões de Projetos - 2021.1 - Prof.Ronaldo 🎷                         *
  *                                                                                           *
  *********************************************************************************************
	*/

public class OrdenadorPorAno extends OrdenadorTemplate {

	@Override
	public boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2) {

		if (musica1.ano.compareToIgnoreCase(musica2.ano) <= 0) {
			return true;

		}
    
		return false;

	}

}