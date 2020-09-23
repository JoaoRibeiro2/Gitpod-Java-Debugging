import tarefas.Multiplica;
import tarefas.Fatora;


/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Multiplica m = new Multiplica("10", 10);
        m.setTempo(1000);


        Multiplica m2 = new Multiplica("20", 20);
        m2.setTempo(500);
        // Fatora f = new Fatora(5);
        // f.start();
        // m.start();
    }

    


}