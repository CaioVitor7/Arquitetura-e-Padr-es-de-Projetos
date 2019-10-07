package FactoryMethod;

/**
* Esta classe concreta contém a implementação
* de uma aplicação capaz de manipular documentos
* do tipo MeuDocumento.
*/
  class MinhaAplicacao extends Aplicacao {

 	/**
 	 * Uma implementação do Factory Method. Este método é
 	 * especializado na criação de documentos do tipo MeuDocumento
 	 */
 	Documento criaDocumento() {
            return new MeuDocumento();
 	}
  }
