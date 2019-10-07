package FactoryMethod;
/**
* Abstração de um Documento.
*/
	 abstract class Documento {

	      void abrir() {
	          System.out.println("Documento:Abrir documento!");
	      }

	      void fechar() {
	          System.out.println("Documento:Fechar documento!");
	      }

	      void gravar() {
	          System.out.println("Documento:Gravar documento!");
	      }
	  }


