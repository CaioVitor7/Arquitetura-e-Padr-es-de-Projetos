package Adapter;

//Classe adaptador (Adapter)
class AdaptadorNitendoParaAtari extends SensorNitendo {

  private SensorAtari adaptee;

  public AdaptadorNitendoParaAtari(SensorAtari adaptee) {
      this.adaptee = adaptee;
  }

  //Override da solicitação
  public void conectarNitendo() {
      adaptee.conectarAtari();
      System.out.println("But stadia wins!");
  }
}