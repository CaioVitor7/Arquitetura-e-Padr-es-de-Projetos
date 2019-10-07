package Adapter;

//Classe Cliente(Client)
public class ControleNitendo {

  private SensorNitendo sensorAQueSeConecta;
  
  public void Conectar(SensorNitendo sensor){
      this.sensorAQueSeConecta = sensor;
      sensorAQueSeConecta.conectarNitendo();
  }

}
