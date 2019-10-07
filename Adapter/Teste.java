package Adapter;

public class Teste{
    public static void main(String[] args) {
        
        //Tem-se um Atari e mas deseja-se usar um controle Nitendo:
        SensorAtari adaptee = new SensorAtari();
        ControleNitendo target = new ControleNitendo();
        
        //Cria-se um falso sensor de Nitendo que, na verdade, traduz e repassa os comandos para o Atari em questão:
        AdaptadorNitendoParaAtari adapter = new AdaptadorNitendoParaAtari(adaptee);
        
        //Conecta-se o controle ao adapter:
        target.Conectar(adapter);
    }
}

//Saída:
//Um novo controle foi conectado ao sensor do Xbox.
//But stadia wins